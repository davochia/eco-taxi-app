package com.example.ecotaxi.exception;

public class CustomerNotFoundException extends RuntimeException{

    public CustomerNotFoundException(Integer id) {
        super("Could not find customer with id " + id);
    }
}