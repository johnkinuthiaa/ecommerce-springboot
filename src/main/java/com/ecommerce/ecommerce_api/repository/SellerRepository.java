package com.ecommerce.ecommerce_api.repository;

import com.ecommerce.ecommerce_api.model.Seller;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SellerRepository extends JpaRepository<Seller, Long> {
}
