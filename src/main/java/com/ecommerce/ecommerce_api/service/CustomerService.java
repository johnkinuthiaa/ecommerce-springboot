package com.ecommerce.ecommerce_api.service;

import com.ecommerce.ecommerce_api.exeptions.CustomerNotFoundException;
import com.ecommerce.ecommerce_api.model.Customer;
import com.ecommerce.ecommerce_api.repository.CustomerRepository;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CustomerService implements CustomerServiceInterface{
    private final CustomerRepository customerRepository;
    public CustomerService(CustomerRepository customerRepository){
        this.customerRepository=customerRepository;
    }
    @Override
    public List<Customer> getAllCustomers(){
        return customerRepository.findAll();
    }
    @Override
    public Customer getCustomerById(Integer id) throws CustomerNotFoundException {
        if(customerRepository.findById(id).isEmpty()){
            throw new CustomerNotFoundException();
        }
        return customerRepository.findById(id).orElse(null);
    }
    @Override
    public Customer updateCustomersDetails(Customer customer,Integer id)throws CustomerNotFoundException {
        if(customerRepository.findById(id).isEmpty()){
            throw new RuntimeException("todo does not exist");
        } else if (customerRepository.findById(id).isPresent()) {
            customerRepository.deleteById(id);
        }
        return customerRepository.save(customer);
    }
    @Override
    public Customer addNewCustomer(Customer customer, Integer id){
        if(customerRepository.findById(id).isPresent()){
            throw new RuntimeException();
        }
        return customerRepository.save(customer);
    }
    @Override
    public void deleteCustomer(Integer id){
        if(customerRepository.findById(id).isPresent()){
            customerRepository.deleteById(id);
        }else{
            throw new RuntimeException();
        }
    }
    @Override
    public List<Customer> getCustomerByName(String name){
        return customerRepository.findAll().stream()
                .filter(customer ->customer.getFirstName().toLowerCase().contains(name.toLowerCase()))
                .collect(Collectors.toList());
    }

}
