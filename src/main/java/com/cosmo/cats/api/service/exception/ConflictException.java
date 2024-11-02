package com.cosmo.cats.api.service.exception;


public class ConflictException extends RuntimeException {

    public ConflictException(String message) {
        super(message);
    }
}