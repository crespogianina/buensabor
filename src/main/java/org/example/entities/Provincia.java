package org.example.entities;
import lombok.*;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Provincia extends BaseEntidad{
    private String nombre;
    private Pais pais;
}
