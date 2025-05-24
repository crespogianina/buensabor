package org.example.entities;

import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class Promocion {
    private String denominacion;
    private LocalDate fechaDesde;
    private LocalDate fechaHasta;
    private LocalTime horaDesde;
    private LocalTime horaHasta;
    private String descripcionDescuento;
    private Double precioPromocional;
    private TipoPromocion tipoPromocion;
    private Set<Articulo> articulos;
    private Set<ImagenPromocion> imagenes;

    public void addArticulo(Articulo articulo) {
        if (this.articulos == null) this.articulos = new HashSet<>();
        this.articulos.add(articulo);
    }

    public void removeArticulo(Articulo articulo) {
        this.articulos.remove(articulo);
    }

    public void addImagenPromocion(ImagenPromocion imagenPromocion) {
        if (this.imagenes == null) this.imagenes = new HashSet<>();
        this.imagenes.add(imagenPromocion);
    }

    public void removeImagenPromocion(ImagenPromocion imagenPromocion) {
        this.imagenes.remove(imagenPromocion);
    }
}
