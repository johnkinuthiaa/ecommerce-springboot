package com.ecommerce.ecommerce_api.exeptions;

public class ItemAlreadyExistException extends RuntimeException{

    public ItemAlreadyExistException() {
    }

    public ItemAlreadyExistException(String message){
        super(message);
    }
}
