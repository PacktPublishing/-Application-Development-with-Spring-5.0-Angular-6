package com.packt.petstore.exception;

public class NotFoundInDBException extends PetStoreException {

    public NotFoundInDBException(String message) {
        super(message);
    }
}
