package org.example.entities;

import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter

public class Usuario {
    private String auth0Id;
    private String username;
}
