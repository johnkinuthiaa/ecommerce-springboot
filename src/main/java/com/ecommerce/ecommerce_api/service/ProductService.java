package com.ecommerce.ecommerce_api.service;

import com.ecommerce.ecommerce_api.exeptions.ItemAlreadyExistException;
import com.ecommerce.ecommerce_api.exeptions.ProductNotFoundException;
import com.ecommerce.ecommerce_api.model.Products;
import com.ecommerce.ecommerce_api.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

@Service
public class ProductService implements ProductServiceInterface{

    private final ProductRepository productRepository;
    public ProductService(ProductRepository productRepository){
        this.productRepository=productRepository;
    }
    @Override
    public List<Products> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Products addProductToCatalog(Products product) throws ItemAlreadyExistException {
        return productRepository.save(product);
//        if(productRepository.i){
//           throw new ItemAlreadyExistException("Product cannot be added to catalog since it already exists");
//        }else {
//
//        }
    }
    @Override
    public List<Products> getProductByManufacturer(String manufacturer){
        return productRepository.findAll().stream()
                .filter(products->products.getManufacturer().toLowerCase().contains(manufacturer.toLowerCase()))
                .collect(Collectors.toList());
    }
    @Override
    public List<Products> getProductByCategory(String category){
        return productRepository.findAll().stream()
                .filter(products -> products.getCategory().toLowerCase().contains(category.toLowerCase()))
                .collect(Collectors.toList());
    }

    @Override
    public Products getProductById(Integer id) throws ProductNotFoundException{
        if (productRepository.findById(id).isEmpty()){
            throw new ProductNotFoundException("no products with"+ id+" was found");
        }
        return productRepository.findById(id).orElse(null);
    }
    @Override
    public List<Products> getProductByName(String name){
        return productRepository.findAll().stream()
                .filter(products -> products.getProductName().toLowerCase().contains(name.toLowerCase()))
                .collect(Collectors.toList());
    }

    @Override
    public Products saveProduct(Products product,Integer id) throws ItemAlreadyExistException{
        if(productRepository.existsById(id)){
            throw new ItemAlreadyExistException("Product cannot be updated since it already exists");
        }
        return productRepository.save(product);
    }

    @Override
    public Products update(Products product,Integer id) throws  ProductNotFoundException{
        if(productRepository.findById(id).isEmpty()){
            throw new RuntimeException("todo does not exist");
        } else if (productRepository.findById(id).isPresent()) {
            productRepository.deleteById(id);
        }
        return productRepository.save(product);
    }

    @Override
    public void deleteProduct(Integer id) throws ProductNotFoundException{
        if(productRepository.findById(id).isPresent()){
            productRepository.deleteById(id);
        }else{
            throw new ProductNotFoundException("cannot delete product since it does not exist");
        }
    }

}
