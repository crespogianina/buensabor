package org.example.entitiess;

import lombok.*;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Localidad {
    private String nombre;
    private Provincia provincia;
}
