package com.ecommerce.ecommerce_api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Cart {
    @Id
    private Integer cardId;
//    private List<CartItem> cartItems =new ArrayList<>();
    private Double totalItems;

}
