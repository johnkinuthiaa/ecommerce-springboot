package com.ecommerce.ecommerce_api.model;



import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.util.List;

@Entity
public class Order {
    @Id
    private Integer orderId;
    private LocalDate orderDate;
    private String OrderStatus;
    private Double totalPrice;

}
