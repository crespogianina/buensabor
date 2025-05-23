package org.example.entities;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder

public class Usuario {
    private String auth0Id;
    private String username;
}
