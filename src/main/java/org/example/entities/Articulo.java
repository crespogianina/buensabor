package org.example.entities;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.util.HashSet;
import java.util.Set;
@SuperBuilder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public abstract class Articulo {

    protected String denominacion;
    protected Double precioVenta;

    private UnidadMedida unidadMedida;
    private Set<ImagenArticulo> imagenes = new HashSet();


    public void addImagen(ImagenArticulo imagen){
        if (this.imagenes == null) {
            this.imagenes = new HashSet<ImagenArticulo>();
        }
        this.imagenes.add(imagen);
    }

    public void removeImagen(ImagenArticulo imagen){
        imagenes.remove(imagen);
    }

}
