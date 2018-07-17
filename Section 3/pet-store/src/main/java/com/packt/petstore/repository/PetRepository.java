package com.packt.petstore.repository;

import com.packt.petstore.model.Pet;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface PetRepository extends ReactiveCrudRepository<Pet, String> { }
