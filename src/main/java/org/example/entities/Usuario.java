package org.example.entities;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@SuperBuilder
public class Usuario extends BaseEntidad{
    private String auth0Id;
    private String username;
}
