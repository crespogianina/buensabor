package org.example.entities;

import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ArticuloManufacturadoDetalle extends BaseEntidad {

    private Integer cantidad;
    private ArticuloInsumo insumo;
}
