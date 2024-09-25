package com.ecommerce.ecommerce_api.model;

import jakarta.persistence.Id;

public class CartItem {
    @Id
    private Integer cartItemId;
    private Products cartItemProduct;
    private Double cartItemQuantity;
}
