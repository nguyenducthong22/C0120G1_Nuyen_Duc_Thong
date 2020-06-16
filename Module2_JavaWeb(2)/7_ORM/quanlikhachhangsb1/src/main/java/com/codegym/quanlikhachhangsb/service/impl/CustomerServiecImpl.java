package com.codegym.quanlikhachhangsb.service.impl;

import com.codegym.quanlikhachhangsb.model.Customer;
import com.codegym.quanlikhachhangsb.repository.CustomerRepository;
import com.codegym.quanlikhachhangsb.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CustomerServiecImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public Customer findById(Long id) {
        return customerRepository.findById(id);
    }

    @Override
    public void save(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public void remove(Long id) {
        customerRepository.remove(id);
    }
}