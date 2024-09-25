package com.ecommerce.ecommerce_api.service;

import com.ecommerce.ecommerce_api.model.Cart;
import com.ecommerce.ecommerce_api.repository.CartRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartService implements CartServiceInterface{
    private final CartRepository cartRepository;

    public CartService(CartRepository cartRepository){
        this.cartRepository=cartRepository;
    }

    @Override
    public List<Cart> getAllProductsInCarts() {
        return cartRepository.findAll();
    }

    @Override
    public void deleteCartById(Cart cart,Long id) {
        if(cartRepository.findById(id).isPresent()){
            cartRepository.delete(cart);
        }else {
            throw new RuntimeException("item was not found in cart");
        }
    }
    @Override
    public void clearCart() throws RuntimeException{
        if(cartRepository.findAll().isEmpty()){
            throw new RuntimeException("cart is already empty");
        }else{
            cartRepository.deleteAll();
        }
    }
    @Override
    public Cart addItemToCart(Cart cart,Long id){
        if(cartRepository.findById(id).isPresent()){
            throw new RuntimeException("item already exists in cart");
        }
        return cartRepository.save(cart);

    }
}
