package com.ecommerce.ecommerce_api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class Seller {
    @Id
    private Long sellerId;
    private String firstName;
    private String lastName;
    private String mobileNo;
    private String emailId;
    private String password;
    private LocalDate createdOn;

    public Seller(){}
    public Seller(Long sellerId,String firstName,String lastName,String mobileNo,String emailId,String password,LocalDate createdOn){
        this.sellerId=sellerId;
        this.firstName=firstName;
        this.lastName=lastName;
        this.mobileNo=mobileNo;
        this.emailId=emailId;
        this.password=password;
        this.createdOn=createdOn;
    }

    public void setSellerId(Long sellerId){
        this.sellerId=sellerId;
    }
    public Long getSellerId(){
        return sellerId;
    }
    public void setFirstName(String firstName){
        this.firstName=firstName;
    }
    public String getFirstName(){
        return firstName;
    }
    public void setLastName(String lastName){
        this.lastName=lastName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setMobileNo(String mobileNo){
        this.mobileNo=mobileNo;
    }
    public String getMobileNo(){
        return mobileNo;
    }
    public void setEmailId(){
        this.emailId=emailId;
    }
    public String getEmailId(){
        return emailId;
    }
    public void setPassword(String password){
        this.password=password;
    }
    public String getPassword(){
        return password;
    }
    public void setCreatedOn(LocalDate createdOn){
        this.createdOn=createdOn;
    }
    public LocalDate getCreatedOn(){
        return createdOn;
    }

}
