package com.ecommerce.ecommerce_api.repository;

import com.ecommerce.ecommerce_api.model.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Products,Integer> {
}
