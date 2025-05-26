package org.example.entities;

import lombok.*;
import lombok.experimental.SuperBuilder;

@NoArgsConstructor
@SuperBuilder
@Setter
@Getter
@AllArgsConstructor
@ToString
public class ImagenCliente extends BaseEntidad {
    private String denominacion;
}

