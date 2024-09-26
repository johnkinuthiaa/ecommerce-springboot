package com.ecommerce.ecommerce_api.controller;

import com.ecommerce.ecommerce_api.model.Seller;
import com.ecommerce.ecommerce_api.service.SellerServiceInterface;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/seller")
public class SellerController {
    private final SellerServiceInterface service;
    public SellerController(SellerServiceInterface service){
        this.service=service;
    }
    @GetMapping("/all")
    public List<Seller> getAllSellers(){
        return service.getAllSellers();
    }
    @GetMapping("/get/{id}")
    public Seller getSellerById(@PathVariable@RequestParam Long id){
        return service.getSellerById(id);
    }
    @PostMapping("/create-user")
    public Seller createSeller(@RequestBody Seller seller,@RequestParam Long id){
        return service.createSeller(seller,id);
    }
    @PutMapping("/update-seller")
    public Seller updateSeller(@RequestBody Seller seller,@RequestParam Long id){
        return service.updateSeller(seller,id);
    }
    @DeleteMapping("/delete-user")
    public void deleteSellerById(@RequestParam Long id){
        service.deleteSellerById(id);
    }
    @DeleteMapping("/delete/all-sellers")
    public void deleteAllSellers(){
        service.deleteAllSellers();
    }

}
