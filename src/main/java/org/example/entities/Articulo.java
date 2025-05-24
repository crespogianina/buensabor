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
@ToString
public abstract class Articulo {

    protected String denominacion;
    protected Double precioVenta;

    private UnidadMedida unidadMedida;
    private Set<ImagenArticulo> imagenes;


    public void addImagen(ImagenArticulo imagen) {
        if (this.imagenes == null) {
            this.imagenes = new HashSet<ImagenArticulo>();
        }
        this.imagenes.add(imagen);
    }

    public void removeImagen(ImagenArticulo imagen) {
        imagenes.remove(imagen);
    }

}
