package com.ecommerce.ecommerce_api.service;

import com.ecommerce.ecommerce_api.model.Products;

import java.util.List;

public interface ProductServiceInterface {
    List<Products> getAllProducts();
    List<Products> getProductByName(String name);
    List<Products> getProductByManufacturer(String manufacturer);
    List<Products> getProductByCategory(String category);
    Products addProductToCatalog(Products product);
    Products getProductById(Integer id);
    Products saveProduct(Products product,Integer  id);
    Products update(Products product,Integer id);
    void deleteProduct(Integer id);


}
