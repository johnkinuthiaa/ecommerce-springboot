package com.ecommerce.ecommerce_api.repository;

import com.ecommerce.ecommerce_api.model.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Orders, Long> {
}
