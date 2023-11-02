package sv.edu.ufg.CINEMA.dto;

import lombok.*;
import sv.edu.ufg.CINEMA.model.Director;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class PeliculaDTO {

    @EqualsAndHashCode.Include
    private Integer id;

    @NotNull
    private String titulo;

    @NotNull
    private int anoLanzamiento;

    @NotNull
    private DirectorDTO director;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnoLanzamiento() {
        return anoLanzamiento;
    }

    public void setAnoLanzamiento(int anoLanzamiento) {
        this.anoLanzamiento = anoLanzamiento;
    }

    public DirectorDTO getDirector() {
        return director;
    }

    public void setDirector(DirectorDTO director) {
        this.director = director;
    }
}
