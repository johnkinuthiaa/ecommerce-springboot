package com.ecommerce.ecommerce_api.service;

import com.ecommerce.ecommerce_api.model.Customer;

import java.util.List;

public interface CustomerServiceInterface {
    List<Customer> getAllCustomers();

    List<Customer> getCustomerByName(String name);
    Customer getCustomerById(Integer id);
    Customer updateCustomersDetails(Customer customer,Integer id);
    Customer addNewCustomer(Customer customer,Integer id);
    void deleteCustomer(Integer id);

}
