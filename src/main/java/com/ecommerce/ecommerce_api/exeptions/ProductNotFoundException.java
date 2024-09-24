package com.ecommerce.ecommerce_api.exeptions;

public class ProductNotFoundException extends RuntimeException{

    public ProductNotFoundException() {
    }

    public ProductNotFoundException(String message){
        super(message);
    }
}
