package com.packt.petstore.service;

import com.packt.petstore.exception.ExistingAccountException;
import com.packt.petstore.model.PetStoreUser;
import com.packt.petstore.model.PetStoreUserDTO;
import com.packt.petstore.repository.PetStoreUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class ReactivePetStoreUserService implements IReactivePetStoreUserService {

    @Autowired
    private PetStoreUserRepository petStoreUserRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public Mono<Void> registerNewUser(PetStoreUserDTO dto) {
        return this.petStoreUserRepository.findByEmail(dto.getEmail())
                .flatMap(existingUser -> Mono.error(new ExistingAccountException("Email is alredy registered")))
                .switchIfEmpty(Mono.defer(() -> createPetStoreUser(dto)))
                .flatMap(user -> petStoreUserRepository.save((PetStoreUser) user))
                .then();
    }

    private Mono<PetStoreUser> createPetStoreUser(PetStoreUserDTO dto) {
        return Mono.just(new PetStoreUser(dto.getName(), 10_000l, dto.getEmail(), passwordEncoder.encode(dto.getPassword())));
    }
}
