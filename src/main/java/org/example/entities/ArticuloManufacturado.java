package org.example.entities;
import lombok.*;

import java.util.HashSet;
import java.util.Set;


@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor


public class ArticuloManufacturado extends Articulo {

    private String descripcion;
    private Integer tiempoEstimadoMinutos;
    private String preparacion;
    private Set<ArticuloManufacturadoDetalle> detalles;


    public void addDetalle(Integer cantidad, ArticuloInsumo insumo) {
        ArticuloManufacturadoDetalle detalle = new ArticuloManufacturadoDetalle(cantidad, insumo);
        if (this.detalles == null){
            this.detalles = new HashSet<ArticuloManufacturadoDetalle>();
        }
        this.detalles.add(detalle);
    }
    public void addDetalle(ArticuloManufacturadoDetalle detalle) {
        if (this.detalles == null){
            this.detalles = new HashSet<ArticuloManufacturadoDetalle>();
        }
        this.detalles.add(detalle);
    }

    public void removeDetalle(ArticuloManufacturadoDetalle detalle){
        this.detalles.remove(detalle);
    }

}
