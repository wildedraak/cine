package sv.edu.ufg.CINEMA.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import jakarta.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Director {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    private String apellido;
    private String pais;
}