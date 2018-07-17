package com.packt.petstore.config.security;

import com.packt.petstore.repository.PetStoreUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.ReactiveUserDetailsService;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class ReactiveUserDetailServiceImpl implements ReactiveUserDetailsService {

    @Autowired private PetStoreUserRepository petStoreUserRepository;
    @Autowired private PasswordEncoder passwordEncoder;

    @Override
    public Mono<UserDetails> findByUsername(String email) {
        return this.petStoreUserRepository.findByEmail(email)
                .map(petStoreUser -> User.withUsername(email)
                        .password(petStoreUser.getPassword())
                        .roles("USER")
                        .build())
                .switchIfEmpty(Mono.defer(() -> Mono.error(new UsernameNotFoundException("Invalid Credentials"))));


    }
}
