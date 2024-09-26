package com.ecommerce.ecommerce_api.service;

import com.ecommerce.ecommerce_api.model.Order;
import com.ecommerce.ecommerce_api.repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService implements OrderServiceInterface{
    private final OrderRepository repository;
    public OrderService(OrderRepository repository){
        this.repository=repository;
    }

    @Override
    public List<Order> getAllOrders() {
        return repository.findAll();
    }
}
