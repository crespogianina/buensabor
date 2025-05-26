package org.example.entities;

import lombok.*;

@NoArgsConstructor
@Builder
@Setter
@Getter
@AllArgsConstructor
@ToString
public class ImagenCliente extends BaseEntidad {
    private String denominacion;
}

