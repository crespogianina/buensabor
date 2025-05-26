package org.example.entities;

import lombok.*;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UnidadMedida extends BaseEntidad{
    private String denominacion;
}
