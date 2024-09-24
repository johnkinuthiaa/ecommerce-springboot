package com.ecommerce.ecommerce_api.controller;

import com.ecommerce.ecommerce_api.model.Products;
import com.ecommerce.ecommerce_api.service.ProductServiceInterface;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/product/catalog")
public class ProductController {
    private final ProductServiceInterface service;

    public ProductController(ProductServiceInterface service){
        this.service=service;
    }
    @GetMapping("/all")
    public List<Products> getAllProducts() {
        return service.getAllProducts();
    }

    public void addProductToCatalog(Products product, Integer id) {

    }


    public Products getProductById(Integer id) {
        return null;
    }


    public Products saveProduct(Products product, Integer id) {
        return null;
    }


    public Products update(Products product, Integer id) {
        return null;
    }


    public void deleteProduct(Products products, Integer id) {

    }


    public List<Products> getProductsByCategory(String category) {
        return List.of();
    }
}
