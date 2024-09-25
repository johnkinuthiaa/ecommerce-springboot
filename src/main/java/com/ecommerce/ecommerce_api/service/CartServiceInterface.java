package com.ecommerce.ecommerce_api.service;

import com.ecommerce.ecommerce_api.model.Cart;

import java.util.List;

public interface CartServiceInterface {
    List<Cart> getAllProductsInCarts();
    void deleteCartById(Cart cart,Long id);
    void clearCart();
    Cart addItemToCart(Cart cart,Long id);

}
