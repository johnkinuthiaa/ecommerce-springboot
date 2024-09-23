package com.ecommerce.ecommerce_api.model;

import jakarta.persistence.Id;

public class CartItem {
    @Id
    private Integer cardItemId;
    private Products cartItemProduct;
    private Double cartItemQuantity;
}
