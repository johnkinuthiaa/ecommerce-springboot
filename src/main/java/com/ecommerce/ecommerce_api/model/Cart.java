package com.ecommerce.ecommerce_api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Cart {
    @Id
    private Long cartId;
    private String itemInCart;
    private Double totalPrice;

    public Cart(){}
    public Cart(Long cartId,String itemInCart,Double totalPrice){
        this.cartId =cartId;
        this.itemInCart=itemInCart;
        this.totalPrice=totalPrice;
    }
    public void setCartId(Long cartId){
        this.cartId = cartId;
    }
    public Long getCartId(){
        return cartId;
    }
    public void setItemInCart(String itemInCart){
        this.itemInCart=itemInCart;
    }
    public String getItemInCart(){
        return itemInCart;
    }
    public void setTotalPrice(Double totalPrice){
        this.totalPrice=totalPrice;
    }
    public Double getTotalPrice(){
        return totalPrice;
    }
}
