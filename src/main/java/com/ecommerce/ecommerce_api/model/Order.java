package com.ecommerce.ecommerce_api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Order {
    @Id
    private Long customerId;
    private String firstName;
    private String lastName;
    private String mobileNo;
    private String emailId;
    private String password;

//    public Order(){}
//    public Order(Long id,Double total,Long creditCardNumber,String status){
//        this.id=id;
//        this.creditCardNumber=creditCardNumber;
//        this.total=total;
//        this.status=status;
//    }
//    public void setId(Long id){
//        this.id=id;
//    }
//    public Long getId(){
//        return id;
//    }
//    public void setCreditCardNumber(Long creditCardNumber){
//        this.creditCardNumber=creditCardNumber;
//    }
//    public Long getCreditCardNumber(){
//        return creditCardNumber;
//    }
//    public void setTotal(Double total){
//        this.total=total;
//    }
//    public Double getTotal(){
//        return total;
//    }
//    public void setStatus(String status){
//        this.status=status;
//    }
//    public String getStatus(){
//        return status;
//    }

}
