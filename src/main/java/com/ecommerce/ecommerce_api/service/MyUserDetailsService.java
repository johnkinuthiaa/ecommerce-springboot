package com.ecommerce.ecommerce_api.service;

import com.ecommerce.ecommerce_api.model.Customer;
import com.ecommerce.ecommerce_api.model.UserPrincipal;
import com.ecommerce.ecommerce_api.repository.CustomerRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService {
    private final CustomerRepository repository;

    public MyUserDetailsService(CustomerRepository repository) {
        this.repository = repository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Customer customer =repository.findByUsername(username);
        if(customer ==null){
            throw new UsernameNotFoundException("user not found");
        }
        return new UserPrincipal(customer);
    }
}
