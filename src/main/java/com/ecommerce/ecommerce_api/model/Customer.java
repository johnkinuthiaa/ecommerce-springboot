package com.ecommerce.ecommerce_api.model;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Customer {
    private Integer customerId;
    private String firstName;
    private String lastName;
    private String mobileNo;
    private String emailId;
    private String password;
    private LocalDate createdOn;
    private String creditCardNumber;
    private Map<String, Address> addressMap =new HashMap<>();

}
