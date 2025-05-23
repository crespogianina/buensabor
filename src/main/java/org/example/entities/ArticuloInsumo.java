package org.example.entities;
import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ArticuloInsumo extends Articulo {


    private double precioCompra;
    private Integer stockActual;
    private Integer stockMaximo;
    private boolean esParaElaborar;

    }
