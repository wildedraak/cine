package sv.edu.ufg.CINEMA.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExceptionResponse {

    private LocalDateTime datetime;
    private String message;
    private String details;
}
