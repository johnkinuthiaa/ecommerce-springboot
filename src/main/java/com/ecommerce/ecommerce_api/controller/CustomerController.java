package com.ecommerce.ecommerce_api.controller;

import com.ecommerce.ecommerce_api.model.Customer;
import com.ecommerce.ecommerce_api.service.CustomerServiceInterface;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/customers")
public class CustomerController {
    private final CustomerServiceInterface customerService;
    public CustomerController(CustomerServiceInterface customerService){
        this.customerService=customerService;
    }

    @GetMapping("/all")
    public List<Customer> getAllCustomers(){
        return customerService.getAllCustomers();
    }
    @GetMapping("/products/{id}")
    public Customer getProductById(@PathVariable Integer id) {
        return customerService.getCustomerById(id);
    }
    @PutMapping("/update-customer-info")
    public Customer updateCustomersDetails(@RequestBody Customer customer,@RequestParam Integer id){
        return customerService.updateCustomersDetails(customer,id);
    }
    @PostMapping("/add-new")
    public Customer addNewCustomer(@RequestBody Customer customer,@RequestParam Integer id){
        return customerService.addNewCustomer(customer,id);
    }
    @DeleteMapping("/delete-customer")
    public void deleteCustomer(@RequestParam Integer id){
        customerService.deleteCustomer(id);
    }

}
