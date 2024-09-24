package com.ecommerce.ecommerce_api.service;

import com.ecommerce.ecommerce_api.model.Products;
import org.springframework.stereotype.Service;


import java.util.List;

public interface ProductServiceInterface {
    List<Products> getAllProducts();
    Products addProductToCatalog(Products product);
    Products getProductById(Integer  id);
    Products saveProduct(Products product,Integer  id);
    Products update(Products product,Integer id);
    void deleteProduct(Integer id);
    List<Products> getProductsByCategory(String category);


}
