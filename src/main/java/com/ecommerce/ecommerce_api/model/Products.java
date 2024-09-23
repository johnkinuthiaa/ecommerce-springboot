package com.ecommerce.ecommerce_api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Products {
    @Id
    private Integer productId;
    private String productName;
    private Double price;
    private String description;
    private String manufacturer;
    private Integer quantity;
    private String category;


}
