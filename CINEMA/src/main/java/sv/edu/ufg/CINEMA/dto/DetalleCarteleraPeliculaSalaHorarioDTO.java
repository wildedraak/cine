package sv.edu.ufg.CINEMA.dto;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import sv.edu.ufg.CINEMA.model.Cartelera;
import sv.edu.ufg.CINEMA.model.Horario;
import sv.edu.ufg.CINEMA.model.Pelicula;
import sv.edu.ufg.CINEMA.model.Sala;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class DetalleCarteleraPeliculaSalaHorarioDTO {
    @EqualsAndHashCode.Include
    private Integer id;

    @NotNull
    private Cartelera cartelera;

    @NotNull
    private Pelicula pelicula;

    @NotNull
    private Sala sala;

    @NotNull
    private Horario horario;
}
