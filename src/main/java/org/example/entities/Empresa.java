package org.example.entities;
import lombok.*;

import java.util.Set;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Empresa {

    private String nombre;
    private String razonSocial;
    private Integer cuil;
    private Set<Sucursal> sucursales;

}
