package com.lcwd.user.service.exceptions;

public class ResourceNotFoundException extends RuntimeException{

    // Extra properties u want to manage
    public ResourceNotFoundException(){
        super("Resource not found exception");
    }

    public ResourceNotFoundException(String message){
        super(message);
    }
}
