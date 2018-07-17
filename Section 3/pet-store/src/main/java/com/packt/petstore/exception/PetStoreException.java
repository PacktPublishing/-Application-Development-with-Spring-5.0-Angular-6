package com.packt.petstore.exception;

public abstract class PetStoreException extends RuntimeException {

    public PetStoreException(String message) {
        super(message);
    }

}
