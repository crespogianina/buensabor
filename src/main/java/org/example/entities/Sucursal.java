package org.example.entities;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

import lombok.*;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Sucursal extends BaseEntidad {
    private String nombre;
    private LocalTime horarioApertura;
    private LocalTime horarioCierre;
    private Domicilio domicilio;
    private Set<Categoria> categorias;
    private Set<Promocion> promociones;

    public void addCategoria(Categoria categoria) {
        if (this.categorias == null) this.categorias = new HashSet<>();
        this.categorias.add(categoria);
    }

    public void removeCategoria(Categoria categoria) {
        this.categorias.remove(categoria);
    }

    public void addPromocion(Promocion promocion) {
        if (this.promociones == null) this.promociones = new HashSet<>();
        this.promociones.add(promocion);
    }

    public void removePromocion(Promocion promocion) {
        this.promociones.remove(promocion);
    }
}
