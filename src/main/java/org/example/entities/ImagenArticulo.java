package org.example.entities;

import lombok.*;

@NoArgsConstructor
@Builder
@Setter
@Getter
@AllArgsConstructor
@ToString
public class ImagenArticulo extends BaseEntidad{
    private String denominacion;
}
