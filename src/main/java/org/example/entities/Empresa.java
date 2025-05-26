package org.example.entities;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Empresa extends BaseEntidad{

    private String nombre;
    private String razonSocial;
    private Integer cuil;
    private Set<Sucursal> sucursales;

    public void addSucursal(Sucursal sucursal) {
        if (this.sucursales == null) this.sucursales = new HashSet<>();
        this.sucursales.add(sucursal);
    }

    public void removeSucursal(Sucursal sucursal) {
        this.sucursales.remove(sucursal);
    }
}
