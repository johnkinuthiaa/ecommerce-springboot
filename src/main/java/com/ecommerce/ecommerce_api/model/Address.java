package com.ecommerce.ecommerce_api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer addressId;
    private String streetNumber;
    private String buildingName;
    private String locality;
    private String city;
    private String state;
    private String pincode;

    public Address(){}

    public Address(Integer addressId,String streetNumber,String buildingName,String locality,String city,String state,String pincode){
        this.addressId=addressId;
        this.streetNumber=streetNumber;
        this.locality=locality;
        this.city =city;
        this.state=state;
        this.pincode=pincode;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }
    public Integer getAddressId() {
        return addressId;
    }
    public void setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String getStreetNumber() {
        return streetNumber;
    }

    public String getBuildingName() {
        return buildingName;
    }
    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    public void setCity(String city) {
        this.city = city;
    }
    public String getCity() {
        return city;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }
    public String getLocality() {
        return locality;
    }
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public String getPincode() {
        return pincode;
    }
//    @ManyToOne(cascade = CascadeType.ALL)
//    @JsonIgnore
//    private Customer customer;
//
}
