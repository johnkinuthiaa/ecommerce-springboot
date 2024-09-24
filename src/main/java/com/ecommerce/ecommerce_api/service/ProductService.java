package com.ecommerce.ecommerce_api.service;

import com.ecommerce.ecommerce_api.exeptions.ItemAlreadyExistException;
import com.ecommerce.ecommerce_api.exeptions.ProductNotFoundException;
import com.ecommerce.ecommerce_api.model.Products;
import com.ecommerce.ecommerce_api.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

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
    public Products getProductById(Integer id) throws ProductNotFoundException{
        if (productRepository.findById(id).isEmpty()){
            throw new ProductNotFoundException("no products with"+ id+" was found");
        }
        return productRepository.findById(id).orElse(null);
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
            throw new ProductNotFoundException("Product with given id not found ");
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

    @Override
    public List<Products> getProductsByCategory(String category) throws ProductNotFoundException{
        List<Products> list =productRepository.findAll();
        if (!list.isEmpty()){
            return list;
        }
        else{
            throw new ProductNotFoundException("no item of category"+category+" was found");
        }
    }
}
