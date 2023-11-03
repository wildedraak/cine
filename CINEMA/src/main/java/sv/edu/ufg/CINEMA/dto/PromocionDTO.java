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
public class PromocionDTO {
    @EqualsAndHashCode.Include
    private Integer id;

    @NotNull
    private String nombre;
    @NotNull
    private String descripcion;
    @NotNull
    private double descuento;
    @NotNull
    private Pelicula pelicula;
}
