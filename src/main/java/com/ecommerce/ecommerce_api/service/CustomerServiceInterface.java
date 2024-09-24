package com.ecommerce.ecommerce_api.service;

import com.ecommerce.ecommerce_api.model.Customer;

import java.util.List;

public interface CustomerServiceInterface {
    List<Customer> getAllCustomers();
    Customer getCustomerById(Integer id);
    Customer updateCustomersDetails(Customer customer,Integer id);
    Customer addNewCustomer(Customer customer,Integer id);
    void deleteCustomer(Customer customer,Integer id);

}
