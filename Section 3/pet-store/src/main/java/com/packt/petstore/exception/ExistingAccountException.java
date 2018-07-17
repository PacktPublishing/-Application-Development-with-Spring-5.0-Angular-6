package com.packt.petstore.exception;

public class ExistingAccountException extends PetStoreException {
    public ExistingAccountException(String message) {
        super(message);
    }
}
