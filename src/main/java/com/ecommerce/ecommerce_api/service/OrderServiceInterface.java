package com.ecommerce.ecommerce_api.service;


import com.ecommerce.ecommerce_api.model.Orders;

import java.util.List;

public interface OrderServiceInterface {
//    CRUD
    List<Orders> getAllOrders();
    Orders getOrderById(Long id);
    Orders updateOrder(Orders orders,Long id);
    Orders createOrder(Orders orders,Long id);
    void deleteOrderById(Long id);
    void deleteAllOrders();
}
