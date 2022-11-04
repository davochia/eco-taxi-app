package com.example.ecotaxi.exception;

public class DriverNotFoundException extends RuntimeException{

    public DriverNotFoundException(Integer id) {
        super("Could not find driver with id " + id);
    }
}