package org.example.entities;
import lombok.*;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Pais extends BaseEntidad{
    private String nombre;
}
