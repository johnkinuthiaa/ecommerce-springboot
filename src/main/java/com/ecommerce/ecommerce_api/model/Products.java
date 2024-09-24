package com.ecommerce.ecommerce_api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Products {
    @Id
//    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer productId;
    private String productName;
    private Double price;
    private String description;
    private String manufacturer;
    private Integer quantity;
    private String category;

    public Products(){}

    public Products(Integer productId,String productName,Double price,String description,String manufacturer,Integer quantity,String category){
        this.productId=productId;
        this.productName=productName;
        this.price=price;
        this.description=description;
        this.manufacturer=manufacturer;
        this.quantity=quantity;
        this.category=category;
    }
    public void setProductId(Integer productId){
        this.productId=productId;
    }
    public Integer getProductId(){
        return productId;
    }
    public void setProductName(String productName){
        this.productName=productName;
    }
    public String getProductName(){
        return productName;
    }
    public void setPrice(Double price){
        this.price=price;
    }
    public Double getPrice(){
        return price;
    }
    public void setDescription(String description){
        this.description=description;
    }
    public String getDescription(){
        return description;
    }
    public void setManufacturer(String manufacturer){
        this.manufacturer=manufacturer;
    }
    public String getManufacturer(){
        return manufacturer;
    }
    public void setQuantity(Integer quantity){
        this.quantity=quantity;
    }
    public Integer getQuantity(){
        return quantity;
    }
    public void setCategory(String category){
        this.category=category;
    }
    public String getCategory(){
        return category;
    }
}
