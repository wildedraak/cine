package sv.edu.ufg.CINEMA.dto;

import jakarta.validation.constraints.NotNull;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class PaisDTO {

    @EqualsAndHashCode.Include
    private Integer id;

    @NotNull
    private String name;
}
