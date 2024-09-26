package com.ecommerce.ecommerce_api.controller;

import com.ecommerce.ecommerce_api.model.Orders;
import com.ecommerce.ecommerce_api.service.OrderServiceInterface;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/orders")
public class OrderController {
    private final OrderServiceInterface orderService;

    public OrderController(OrderServiceInterface orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/all")
    public List<Orders> getAllOrders() {
        return orderService.getAllOrders();
    }
    @GetMapping("/get-orders-by-id")
    public Orders getOrderById(@RequestParam Long id) {
        return orderService.getOrderById(id);
    }
    @PutMapping("/update-order")
    public Orders updateOrder(@RequestBody Orders orders,@RequestParam Long id) {
        return orderService.updateOrder(orders,id);
    }
    @PostMapping("/create-new-order")
    public Orders createOrder(@RequestBody Orders orders,@RequestParam Long id) {
        return orderService.createOrder(orders,id);
    }
    @DeleteMapping("/delete-order-by-id")
    public void deleteOrderById(@RequestParam Long id) {
        orderService.deleteOrderById(id);
    }
    @DeleteMapping("/delete-all-order")
    public void deleteAllOrders() {
        orderService.deleteAllOrders();
    }
}