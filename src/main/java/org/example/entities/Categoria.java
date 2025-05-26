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
public class Categoria extends BaseEntidad {

    private String denominacion;
    private Set<Categoria> subcategorias;
    private Categoria categoriaPadre;
    private Set<Articulo> articulos;

    public void addSubcategoria(Categoria subcategoria) {
        if (this.subcategorias == null) {
            this.subcategorias = new HashSet<>();
        }
        this.subcategorias.add(subcategoria);
        subcategoria.setCategoriaPadre(this);
    }

    public void rmSubcategoria(Categoria subcategoria) {
        if (this.subcategorias != null) {
            this.subcategorias.remove(subcategoria);
            subcategoria.setCategoriaPadre(null);
        }
    }

    public void addArticulo(Articulo articulo) {
        if (this.articulos == null) {
            this.articulos = new HashSet<>();
        }
        this.articulos.add(articulo);
    }

    public void removeArticulo(Articulo articulo) {
        if (this.articulos != null) {
            this.articulos.remove(articulo);
        }
    }
}
