package com.packt.petstore.repository;

import com.packt.petstore.model.PetStoreUser;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.lang.NonNull;
import reactor.core.publisher.Mono;

public interface PetStoreUserRepository extends ReactiveCrudRepository<PetStoreUser, String>{

    Mono<PetStoreUser> findByEmail(@NonNull String email);

}
