package sv.edu.ufg.CINEMA.dto;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import sv.edu.ufg.CINEMA.model.Pelicula;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class TrailerDTO {
    @EqualsAndHashCode.Include
    private Integer id;

    @NotNull
    private String titulo;
    @NotNull
    private String url;
    @NotNull
    private String descripcion;
    @NotNull
    private Pelicula pelicula;
}
