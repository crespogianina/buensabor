package org.example.entities;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.Set;

@SuperBuilder

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ArticuloInsumo extends Articulo {
    private double precioCompra;
    private Integer stockActual;
    private Integer stockMaximo;
    private boolean esParaElaborar;
    private String denominacion;
}

