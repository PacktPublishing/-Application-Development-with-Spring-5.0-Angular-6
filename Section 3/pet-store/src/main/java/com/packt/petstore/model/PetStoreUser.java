package com.packt.petstore.model;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@RequiredArgsConstructor
@Document(collection = "petStoreUser")
public class PetStoreUser {
    private @Id String id;
    @NonNull private String name;
    @NonNull private Long moneyAvailable;
    @NonNull private String email;
    @NonNull private String password;
}
