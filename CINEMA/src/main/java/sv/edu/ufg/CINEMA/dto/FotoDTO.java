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
public class FotoDTO {

    @EqualsAndHashCode.Include
    private Integer id;
    @NotNull
    private String nombreArchivo;
    @NotNull
    private String rutaArchivo;
    @NotNull
    private String descripcion;
    @NotNull
    private Pelicula pelicula;
}
