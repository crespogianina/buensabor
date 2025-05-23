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


    public void addDetalle(Integer cantidad, ArticuloInsumo insumo) {
        ArticuloManufacturadoDetalle detalle = ArticuloManufacturadoDetalle.builder()
                .insumo(insumo)
                .cantidad(cantidad).build();
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
