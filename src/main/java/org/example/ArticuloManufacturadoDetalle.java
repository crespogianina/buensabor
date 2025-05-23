package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.List;
import java.util.Set;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class ArticuloManufacturadoDetalle {

    private Integer cantidad;
    private ArticuloInsumo insumo;


   /* public ArticuloManufacturadoDetalle(Integer cantidad, ArticuloInsumo insumo) {
        this.cantidad = cantidad;
        this.insumo = insumo;
    }

    public ArticuloInsumo getInsumo() {
        return insumo;
    }

    public void setArticuloInsumo(ArticuloInsumo insumo){
        this.insumo = insumo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    */

}
