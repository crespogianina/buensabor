package org.example.entities;
import lombok.*;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Provincia {
    private String nombre;
    private Pais pais;
}
