package sv.edu.ufg.CINEMA.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sv.edu.ufg.CINEMA.dto.PeliculaDTO;
import sv.edu.ufg.CINEMA.repo.IPeliculaRepo;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/peliculas")
public class PeliculaController {

    @Autowired
    private IPeliculaRepo iPeliculaRepo;

    @Autowired
    private ModelMapper modelMapper;

    @GetMapping
    public List<PeliculaDTO> findAll() {
        return iPeliculaRepo.findAll().stream()
                .map(jugador -> modelMapper.map(jugador, PeliculaDTO.class))
                .collect(Collectors.toList());
    }

}
