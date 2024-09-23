package com.ecommerce.ecommerce_api.controller;


import com.ecommerce.ecommerce_api.service.AddressServiceInterface;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class AddressController {
    private final AddressServiceInterface serviceInterface;
    public AddressController(AddressServiceInterface serviceInterface){
        this.serviceInterface=serviceInterface;
    }
}
