package org.example.entities;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Categoria {

    private String denominacion;
    private Set<Categoria> subcategorias;
    private Categoria categoriaPadre;
    private Set<Articulo> articulos;



    public void addSubcategoria(Categoria subcategoria) {
        if (this.subcategorias == null) {
            this.subcategorias = new HashSet<Categoria>();

        }
        this.subcategorias.add(subcategoria);
        subcategoria.setCategoriaPadre(this);
    }

    public void rmSubcategoria(Categoria subcategoria) {
        this.subcategorias.remove(subcategoria);
        subcategoria.setCategoriaPadre(null);
    }
    public void setCategoriaPadreActualizar(Categoria categoriaPadre) {
        this.categoriaPadre = categoriaPadre;

        if (categoriaPadre != null) {
            if (categoriaPadre.getSubcategorias() == null) {
                categoriaPadre.setSubcategorias(new HashSet<>());
            }
            categoriaPadre.getSubcategorias().add(this);
        }
    }




    public void addArticulo(Articulo articulo){
        if (this.articulos == null){
            this.articulos = new HashSet();
        }
        this.articulos.add(articulo);
    }

    public void removeArticulo(Articulo articulo){
        this.articulos.remove(articulo);
    }


}
