package org.example.entities;

import lombok.*;
import org.example.entities.Provincia;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Localidad extends BaseEntidad {
    private String nombre;
    private Provincia provincia;

}
