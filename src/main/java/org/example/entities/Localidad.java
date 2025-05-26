package org.example.entities;

import lombok.*;
import lombok.experimental.SuperBuilder;
import org.example.entities.Provincia;

@Setter
@Getter
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Localidad extends BaseEntidad {
    private String nombre;
    private Provincia provincia;

}
