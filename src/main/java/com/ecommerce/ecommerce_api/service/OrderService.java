package com.ecommerce.ecommerce_api.service;

import com.ecommerce.ecommerce_api.model.Orders;
import com.ecommerce.ecommerce_api.repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService implements OrderServiceInterface{
    private final OrderRepository repository;
    public OrderService(OrderRepository repository){
        this.repository=repository;
    }

    @Override
    public List<Orders> getAllOrders() {
        return repository.findAll();
    }

    @Override
    public Orders getOrderById(Long id) {
        if(repository.findById(id).isEmpty()){
            throw new RuntimeException("order not found");
        }
        return repository.findById(id).orElse(null);
    }

    @Override
    public Orders updateOrder(Orders orders, Long id) {
        Optional<Orders> current =repository.findById(id);
        if(current.isEmpty()){
            throw new RuntimeException("todo does not exist");
        }
        Orders toUpdate =current.get();
        toUpdate.setCreditCardNumber(orders.getCreditCardNumber());
        toUpdate.setStatus(orders.getStatus());
        toUpdate.setTotal(orders.getTotal());
        return repository.save(toUpdate);
    }

    @Override
    public Orders createOrder(Orders orders, Long id) {
        if(repository.findById(id).isEmpty()){
            throw new RuntimeException("order not found");
        }
        return repository.save(orders);
    }

    @Override
    public void deleteOrderById(Long id) {
        if(repository.findById(id).isEmpty()){
            throw new RuntimeException("order not found");
        }
        repository.deleteById(id);
    }

    @Override
    public void deleteAllOrders() {
        repository.deleteAll();
    }
}
