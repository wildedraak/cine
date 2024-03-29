package sv.edu.ufg.CINEMA.dto;

import lombok.*;
import sv.edu.ufg.CINEMA.model.Director;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotNull;
import sv.edu.ufg.CINEMA.repo.IGenericRepo;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
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
    @NotNull
    private PaisDTO pais;

}
