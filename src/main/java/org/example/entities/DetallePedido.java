package org.example.entities;

import lombok.*;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class DetallePedido extends BaseEntidad{
    private Integer cantidad;
    private double subTotal;
    private Articulo articulo;

    public void DetallePedido(Integer cantidad, Articulo articulo) {
        this.cantidad = cantidad;
        this.articulo = articulo;
        this.calcularSubtotal();
    }

    public void calcularSubtotal() {
        this.subTotal = this.cantidad * this.articulo.getPrecioVenta();
    }
}
