package com.ecommerce.ecommerce_api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class Customer {
    @Id
    private Integer customerId;
    private String firstName;
    private String lastName;
    private String mobileNo;
    private String emailId;
    private String password;
//    private LocalDate createdOn;
    private Long creditCardNumber;

    public Customer(){}
    public Customer(Integer customerId,
                    String firstName,
                    String lastName,
                    String mobileNo,
                    String emailId,
                    String password,
                    LocalDate createdOn,
                    Long creditCardNumber){
        this.customerId=customerId;
        this.firstName=firstName;
        this.lastName=lastName;
        this.mobileNo=mobileNo;
        this.emailId=emailId;
        this.password=password;
//        this.createdOn=createdOn;
        this.creditCardNumber=creditCardNumber;
    }
    public void setCustomerId(Integer customerId){
        this.customerId=customerId;
    }
    public Integer getCustomerId(){
        return customerId;
    }
    public void setFirstName(String firstName){
        this.firstName=firstName;
    }
    public String getFirstName(){
        return firstName;
    }
    public void setLastName(String lastName){
        this.lastName =lastName;
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
    public void setEmailId(String emailId){
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
//    public void setCreatedOn(LocalDate createdOn){
//        this.createdOn=createdOn;
//    }
//    public LocalDate getCreatedOn(){
//        return this.createdOn;
//    }
    public void setCreditCardNumber(Long creditCardNumber){
        this.creditCardNumber=creditCardNumber;
    }
    public Long getCreditCardNumber(){
        return creditCardNumber;
    }


}
