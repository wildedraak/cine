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
public class Pelicula {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String titulo;
    private int anoLanzamiento;

    @ManyToOne
    @JoinColumn(name = "director_id", referencedColumnName = "id")
    private Director director;

}
