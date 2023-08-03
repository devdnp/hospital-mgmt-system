package com.devdnp.hms.exceptions;

public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(String s) {
        super(s);
    }

    public ResourceNotFoundException(){
        super("Resource Not Found !!");
    }

    public ResourceNotFoundException(String user, String s, int i) {
    }
}
