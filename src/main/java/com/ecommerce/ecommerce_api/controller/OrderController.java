package com.ecommerce.ecommerce_api.controller;

import com.ecommerce.ecommerce_api.model.Order;
import com.ecommerce.ecommerce_api.service.OrderServiceInterface;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/orders")
public class OrderController {
    private final OrderServiceInterface orderService;
    public OrderController(OrderServiceInterface orderService){
        this.orderService=orderService;
    }
    @GetMapping("/all")
    public List<Order> getAllOrders(){
        return orderService.getAllOrders();
    }
}
