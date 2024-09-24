package com.ecommerce.ecommerce_api.service;

import com.ecommerce.ecommerce_api.model.Products;


import java.util.List;


public interface ProductServiceInterface {
    List<Products> getAllProducts();
    void addProductToCatalog(Products product,Integer id);
    Products getProductById(Integer id);
    Products saveProduct(Products product,Integer id);
    Products update(Products product,Integer id);
    void deleteProduct(Products products,Integer id);
    List<Products> getProductsByCategory(String category);


}
