package com.packt.petstore.controller;

import com.packt.petstore.exception.PetStoreException;
import org.springframework.core.annotation.Order;
import org.springframework.core.io.buffer.DataBuffer;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import org.springframework.web.server.WebExceptionHandler;
import reactor.core.publisher.Mono;

import java.nio.charset.StandardCharsets;


@Component
@Order(-2)
public class RestWebExceptionHandler  implements WebExceptionHandler {

    @Override
    public Mono<Void> handle(ServerWebExchange exchange, Throwable ex) {
        if (ex instanceof PetStoreException) {
            exchange.getResponse().setStatusCode(HttpStatus.BAD_REQUEST);
            DataBuffer db = exchange.getResponse().bufferFactory().wrap(ex.getMessage().getBytes(StandardCharsets.UTF_8));
            return exchange.getResponse().writeWith(Mono.just(db));
        }
        return Mono.error(ex);
    }

}
