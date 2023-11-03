package sv.edu.ufg.CINEMA.dto;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import sv.edu.ufg.CINEMA.model.Actor;
import sv.edu.ufg.CINEMA.model.Pelicula;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class DetalleActorPeliculaDTO {
    @EqualsAndHashCode.Include
    private Integer id;

    @NotNull
    private Actor actor;

    @NotNull
    private Pelicula pelicula;
}
