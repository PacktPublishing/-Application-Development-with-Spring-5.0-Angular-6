package com.packt.petstore.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@RequiredArgsConstructor
@Document(collection = "pet")
public class Pet {
    private @Id String id;
    private Long cost;
    private Integer numberInStock;
    private String itemName;
    private String pictureUrl;
}
