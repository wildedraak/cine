package sv.edu.ufg.CINEMA.dto;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class SalaDTO {
    @EqualsAndHashCode.Include
    private Integer id;

    @NotNull
    private String nombre;
    @NotNull
    private Integer capacidad;
}
