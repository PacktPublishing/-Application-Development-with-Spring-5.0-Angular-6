package com.packt.petstore.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class PetStoreUserDTO {
    private String email;
    private String password;
    private String name;
}
