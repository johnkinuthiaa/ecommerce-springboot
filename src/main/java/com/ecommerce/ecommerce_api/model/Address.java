package com.ecommerce.ecommerce_api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Address {
    @Id
    private Integer addressId;
    private String streetNumber;
    private String buildingName;
    private String locality;
    private String city;
    private String state;
    private String pincode;

    public Address(){}

    public Address(Integer addressId,
    String streetNumber,
    String buildingName,
    String locality,
    String city,
    String state,
    String pincode){
        this.addressId=addressId;
        this.streetNumber=streetNumber;
        this.locality=locality;
        this.city =city;
        this.state=state;
        this.pincode=pincode;
    }
}
