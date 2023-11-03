package sv.edu.ufg.CINEMA.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Pais {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
/*
    @OneToMany(mappedBy = "pais", cascade = CascadeType.ALL)
    private List<Pelicula> peliculas;*/
}
