package com.ecommerce.ecommerce_api.service;

import com.ecommerce.ecommerce_api.model.Seller;

import java.util.List;

public interface SellerServiceInterface {
    Seller createSeller(Seller seller,Long id);
    Seller updateSeller(Seller seller,Long id);
    List<Seller> getAllSellers();
    Seller getSellerById(Long id);
    void deleteSellerById(Long id);
    void deleteAllSellers();

}
