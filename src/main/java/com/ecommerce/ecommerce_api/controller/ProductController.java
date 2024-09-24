package com.ecommerce.ecommerce_api.controller;

import com.ecommerce.ecommerce_api.model.Products;
import com.ecommerce.ecommerce_api.service.ProductServiceInterface;
import org.springframework.web.bind.annotation.*;

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
    @PostMapping("/add/products")
    public Products addProductToCatalog(@RequestBody Products product) {
        return service.addProductToCatalog(product);
    }
    @GetMapping("/product/{id}")
    public Products getProductById(@PathVariable Integer id) {
        return service.getProductById(id);
    }
    @PutMapping("/saved-product/{id}")
    public Products saveProduct(@RequestBody Products product,@PathVariable@RequestParam Integer id) {
        return service.saveProduct(product,id);
    }
    @PutMapping("/update/product/{id}")
    public Products update(@RequestBody Products product,@PathVariable@RequestParam Integer id) {
        return service.update(product,id);
    }
    @DeleteMapping("/delete-product/{id}")
    public void deleteProduct(@PathVariable @RequestParam Integer id) {
        service.deleteProduct(id);
    }


    public List<Products> getProductsByCategory(String category) {
        return List.of();
    }
}
