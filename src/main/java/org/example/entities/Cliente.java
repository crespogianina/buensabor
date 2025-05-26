package org.example.entities;

import lombok.*;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Cliente extends BaseEntidad{
    private String nombre;
    private String apellido;
    private String telefono;
    private String email;
    private LocalDate fechaNacimiento;
    private ImagenCliente imagen;
    private Set<Pedido> pedidos;
    private Usuario usuario;
    private Set<Domicilio> domicilios;

    public void addDomicilio(Domicilio domicilio) {
        if (this.domicilios == null) this.domicilios = new HashSet<>();
        this.domicilios.add(domicilio);
    }

    public void removeDomicilio(Domicilio domicilio) {
        this.domicilios.remove(domicilio);
    }

    public void addPedidos(Pedido pedido) {
        if (this.pedidos == null) this.pedidos = new HashSet<>();
        this.pedidos.add(pedido);
    }

    public void removePedido(Pedido pedido) {
        this.pedidos.remove(pedido);
    }
}