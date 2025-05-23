package org.example.entities;

import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class ArticuloManufacturadoDetalle {

    private Integer cantidad;
    private ArticuloInsumo insumo;



}
