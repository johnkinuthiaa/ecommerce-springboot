package com.ecommerce.ecommerce_api.repository;

import com.ecommerce.ecommerce_api.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer> {
}
