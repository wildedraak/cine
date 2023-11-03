package sv.edu.ufg.CINEMA.controller;

import jakarta.validation.Valid;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.ErrorResponse;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import sv.edu.ufg.CINEMA.dto.PeliculaDTO;
import sv.edu.ufg.CINEMA.exception.ModelNotFoundException;
import sv.edu.ufg.CINEMA.model.Director;
import sv.edu.ufg.CINEMA.model.Pais;
import sv.edu.ufg.CINEMA.model.Pelicula;
import sv.edu.ufg.CINEMA.repo.IDirectorRepo;
import sv.edu.ufg.CINEMA.repo.IPaisRepo;
import sv.edu.ufg.CINEMA.repo.IPeliculaRepo;

import java.net.URI;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/peliculas")
public class PeliculaController {

    @Autowired
    private IPeliculaRepo iPeliculaRepo;
    @Autowired
    private IDirectorRepo iDirectorRepo;
    @Autowired
    private IPaisRepo iPaisRepo;


    @Autowired
    private ModelMapper modelMapper;


    @GetMapping
    public ResponseEntity<List<PeliculaDTO>> findAll() {
        List<PeliculaDTO> list = iPeliculaRepo.findAll().stream().map(p -> modelMapper.map(p, PeliculaDTO.class)).collect(Collectors.toList());
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<PeliculaDTO> getPeliculaById(@PathVariable Integer id) {
        Optional<Pelicula> peliculaOptional = iPeliculaRepo.findById(id);
        if (peliculaOptional.isPresent()) {
            PeliculaDTO peliculaDTO = modelMapper.map(peliculaOptional.get(), PeliculaDTO.class);
            return ResponseEntity.ok(peliculaDTO);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody PeliculaDTO peliculaDTO) {
        // Convierte PeliculaDTO a Pelicula usando modelMapper
        Pelicula pelicula = modelMapper.map(peliculaDTO, Pelicula.class);

        // Guarda la película en la base de datos
        iPeliculaRepo.save(pelicula);

        // Devuelve una respuesta 201 Created
        return ResponseEntity.created(null).build();
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminarPelicula(@PathVariable Integer id) {
        iPeliculaRepo.deleteById(id);
        return ResponseEntity.ok().build();
    }


    @PutMapping("/{id}")
    public ResponseEntity<PeliculaDTO> actualizarPelicula(@PathVariable Integer id, @Valid @RequestBody PeliculaDTO peliculaDTO) {
        Optional<Pelicula> peliculaOptional = iPeliculaRepo.findById(id);
            if (peliculaOptional.isPresent()) {
                Pelicula peliculaExistente = peliculaOptional.get();
                peliculaExistente.setTitulo(peliculaDTO.getTitulo());
                peliculaExistente.setAnoLanzamiento(peliculaDTO.getAnoLanzamiento());

                // Actualiza el director y el país de la entidad existente con los valores del DTO
                Director director = new Director();
                director.setId(peliculaDTO.getDirector().getId());

                Pais pais = new Pais();
                pais.setId(peliculaDTO.getPais().getId());

                // Asignar las entidades de director y país a la película existente
                peliculaExistente.setDirector(director);
                peliculaExistente.setPais(pais);

                // Guardar la entidad actualizada en la base de datos usando el método save
                Pelicula peliculaActualizada = iPeliculaRepo.save(peliculaExistente);

                // Directamente devolver la entidad actualizada como PeliculaDTO en la respuesta
                return ResponseEntity.ok(peliculaDTO);
            } else {
                return ResponseEntity.notFound().build();
            }

    }
}
