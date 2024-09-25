package com.ecommerce.ecommerce_api.controller;

import com.ecommerce.ecommerce_api.model.Cart;
import com.ecommerce.ecommerce_api.service.CartServiceInterface;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/cart")
public class CartController {
    private final CartServiceInterface cartServiceInterface;

    public CartController(CartServiceInterface cartServiceInterface){
        this.cartServiceInterface=cartServiceInterface;
    }

    @GetMapping("/all")
    public List<Cart> getAllProductsInCarts(){
        return cartServiceInterface.getAllProductsInCarts();
    }
    @DeleteMapping("/delete/{id}")
    public void deleteCartById(Cart cart,@PathVariable @RequestParam Long id){
        cartServiceInterface.deleteCartById(cart,id);
    }
    @DeleteMapping("/clear-cart")
    public void clearCart(){
        cartServiceInterface.clearCart();
    }
    @PostMapping("/add/item")
    public Cart addItemToCart(@RequestBody Cart cart,@RequestParam Long id){
        return cartServiceInterface.addItemToCart(cart,id);
    }

}
