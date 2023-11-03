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
public class Trailer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String titulo;
    private String url;
    private String descripcion;

    @ManyToOne
    @JoinColumn(name = "pelicula_id", referencedColumnName = "id")
    private Pelicula pelicula;
}
