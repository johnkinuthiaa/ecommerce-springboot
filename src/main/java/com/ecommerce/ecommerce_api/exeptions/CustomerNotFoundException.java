package com.ecommerce.ecommerce_api.exeptions;

public class CustomerNotFoundException extends RuntimeException{
    public CustomerNotFoundException() {
    }

    public CustomerNotFoundException(String message){
        super(message);
    }
}
