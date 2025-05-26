package org.example.entities;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Setter
@Getter
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Provincia extends BaseEntidad{
    private String nombre;
    private Pais pais;
}
