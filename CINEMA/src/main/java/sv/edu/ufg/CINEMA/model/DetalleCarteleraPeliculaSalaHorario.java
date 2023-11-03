package sv.edu.ufg.CINEMA.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class DetalleCarteleraPeliculaSalaHorario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "cartelera_id",referencedColumnName = "id")
    private Cartelera cartelera;

    @ManyToOne
    @JoinColumn(name = "pelicula_id",referencedColumnName = "id")
    private Pelicula pelicula;

    @ManyToOne
    @JoinColumn(name = "sala_id",referencedColumnName = "id")
    private Sala sala;

    @ManyToOne
    @JoinColumn(name = "horario_id",referencedColumnName = "id")
    private Horario horario;
}
