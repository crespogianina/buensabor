package org.example.entities;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.HashSet;
import java.util.Set;

@SuperBuilder

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ArticuloManufacturado extends Articulo {

    private String descripcion;
    private Integer tiempoEstimadoMinutos;
    private String preparacion;
    private Set<ArticuloManufacturadoDetalle> detalles;


    public void addDetalle(ArticuloManufacturadoDetalle articuloManofacturadoDetalle) {
        if (this.detalles == null) {
            this.detalles = new HashSet<ArticuloManufacturadoDetalle>();
        }
        this.detalles.add(articuloManofacturadoDetalle);
    }

    public void removeDetalle(ArticuloManufacturadoDetalle detalle) {
        this.detalles.remove(detalle);

    }
}
