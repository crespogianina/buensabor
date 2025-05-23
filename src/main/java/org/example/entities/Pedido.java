package org.example.entities;

import lombok.*;

import java.time.LocalTime;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Pedido {
    private LocalTime horaEstimadaFinalizacion;
    private double total;
    private double totalCosto;
    private Estado estado;
    private TipoEnvio tipoEnvio;
    private FormaPago formaPago;
    private LocalDate fechaPedido;
    private Domicilio domicilio;
    private Sucursal sucursal;
    private Factura factura;
    private Set<DetallePedido> detallePedido;

    public void addDetallePedido(DetallePedido detallePedido) {
        if (this.detallePedido == null) this.detallePedido = new HashSet<>();
        this.detallePedido.add(detallePedido);
    }

    public void removeDetallePedido(DetallePedido detallePedido) {
        this.detallePedido.remove(detallePedido);
    }

    public void calcularTotal() {
        for (DetallePedido detalle : detallePedido) {
            double subTotal = detalle.getSubtotal();
            this.total += detalle.getSubtotal();
        }
    }
}
