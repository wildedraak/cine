package sv.edu.ufg.CINEMA.dto;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class HorarioDTO {
    @EqualsAndHashCode.Include
    private Integer id;
    @NotNull
    private Date horaInicio;
    @NotNull
    private Date horaFin;
}
