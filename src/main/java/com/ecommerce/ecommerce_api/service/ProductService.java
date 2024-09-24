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
    public void addProductToCatalog(Products product,Integer id) throws ItemAlreadyExistException {
        if(productRepository.existsById(id)){
            throw new ItemAlreadyExistException("Product cannot be added to catalog since it already exists");
        }else {
            productRepository.save(product);
        }
    }

    @Override
    public Products getProductById(Integer id) throws ProductNotFoundException{
        if (!productRepository.existsById(id)){
            throw new ProductNotFoundException("product does not exist");
        }

        return null;
    }

    @Override
    public Products saveProduct(Products product,Integer id) throws ItemAlreadyExistException{
        if(productRepository.existsById(id)){
            throw new ItemAlreadyExistException("Product cannot be updated since it already exists");
        }else {
            productRepository.save(product);
        }
        return null;
    }

    @Override
    public Products update(Products product, Integer id) {
        if(!productRepository.existsById(id)){
            throw new ProductNotFoundException("Product not found with given id");
        }
        return null;
    }

    @Override
    public void deleteProduct(Products product,Integer id) throws ProductNotFoundException{
        if(productRepository.findById(id).isPresent()){
            productRepository.delete(product);
        }else{
            throw new ProductNotFoundException("cannot delete product since it does not exist");
        }
//        return "";
    }

    @Override
    public List<Products> getProductsByCategory(String category) {
        List<Products> list =productRepository.findAll();
        if (!list.isEmpty()){
            return list;
        }
        else{
            return null;
        }
    }
}
