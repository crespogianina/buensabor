package org.example.entities;
import lombok.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Cliente {
    private String nombre;
    private String apellido;
    private String telefono;
    private String email;
    private LocalDate fechaNacimiento;
    private ImagenCliente imagen;
    private Set<Pedido> pedidos = new HashSet<Pedido>();
    private Usuario usuario;
    private Set<Domicilio> domicilios = new HashSet<Domicilio>();


}