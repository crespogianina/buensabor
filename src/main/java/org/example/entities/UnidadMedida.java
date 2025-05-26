package org.example.entities;

import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UnidadMedida extends BaseEntidad{
    private String denominacion;
}
