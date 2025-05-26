package org.example.entities;

import lombok.*;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ArticuloManufacturadoDetalle extends BaseEntidad {

    private Integer cantidad;
    private ArticuloInsumo insumo;
}
