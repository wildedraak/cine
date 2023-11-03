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
    //@JoinColumn(name = "director_id",referencedColumnName = "id", nullable = false, foreignKey = @ForeignKey(name = "FK_PELICULA_DIRECTOR"))
    private Director director;

    @ManyToOne
    @JoinColumn(name = "pais_id", referencedColumnName = "id")
    private Pais pais;

}
