package com.packt.petstore.controller;

import com.packt.petstore.model.Pet;
import com.packt.petstore.repository.PetRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class CatalogController {

    private PetRepository petRepository;

    public CatalogController(PetRepository petRepository) {
        this.petRepository = petRepository;
    }

    @GetMapping("/pets")
    public Flux<Pet> getAllPets() {
        return this.petRepository.findAll();
    }

    @GetMapping("/pet/{id}")
    public Mono<ResponseEntity<Pet>> getPetById(@PathVariable("id") String id) {
        return this.petRepository.findById(id)
                .map(ResponseEntity::ok)
                .defaultIfEmpty(ResponseEntity.notFound().build());

    }
}
