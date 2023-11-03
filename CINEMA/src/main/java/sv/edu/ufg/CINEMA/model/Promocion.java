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
public class Promocion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    private String descripcion;
    private double descuento;

    @ManyToOne
    @JoinColumn(name = "pelicula_id", referencedColumnName = "id")
    private Pelicula pelicula;
}
