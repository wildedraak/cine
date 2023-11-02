package sv.edu.ufg.CINEMA.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import jakarta.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class DirectorDTO {

    private Integer id;

    @NotNull
    private String nombre;

    @NotNull
    private String apellido;

    @NotNull
    private String pais;
}
