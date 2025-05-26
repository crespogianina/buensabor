package org.example.entities;

import lombok.*;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Domicilio extends BaseEntidad{
    private String calle;
    private Integer numero;
    private Integer cp;
    private Localidad localidad;
}
