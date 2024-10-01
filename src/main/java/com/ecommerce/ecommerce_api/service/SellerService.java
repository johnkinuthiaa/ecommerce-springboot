package com.ecommerce.ecommerce_api.service;

import com.ecommerce.ecommerce_api.model.Seller;
import com.ecommerce.ecommerce_api.repository.SellerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SellerService implements SellerServiceInterface{
    private final SellerRepository repository;

    public SellerService(SellerRepository repository){
        this.repository=repository;
    }
    @Override
    public List<Seller> getAllSellers(){
        return repository.findAll();
    }
    @Override
    public Seller getSellerById(Long id){
        if(repository.findById(id).isEmpty()){
            throw new RuntimeException("seller not found");
        }
        return repository.findById(id).orElse(null);
    }
    @Override
    public Seller createSeller(Seller seller,Long id){
        if(repository.findById(id).isPresent()){
            throw new RuntimeException("seller already exists");
        }
        return repository.save(seller);
    }
    @Override
    public Seller updateSeller(Seller seller,Long id){
        if(repository.findById(id).isEmpty()){
            throw new RuntimeException("todo does not exist");
        } else if (repository.findById(id).isPresent()) {
            repository.deleteById(id);
        }
        return repository.save(seller);
    }
    @Override
    public void deleteSellerById(Long id){
        if(repository.findById(id).isEmpty()){
            throw new RuntimeException("seller does not exist");
        }else{
            repository.deleteById(id);
        }
    }
    @Override
    public void deleteAllSellers(){
        repository.deleteAll();
    }


}
