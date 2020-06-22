package com.codegym.demo2.service.impl;

import com.codegym.demo2.model.Customer;
import com.codegym.demo2.model.TypeCustomer;
import com.codegym.demo2.repository.CustomerRepository;
import com.codegym.demo2.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    CustomerRepository customerRepository;


    @Override
    public Customer findById(long id) {
        return customerRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public void remove(long id) {
        customerRepository.deleteById(id);
    }

    @Override
    public Page<Customer> findAllByName(String name, Pageable pageable) {
        return customerRepository.findAllByFirstNameContaining(name, pageable);
    }

    @Override
    public Page<Customer> findAllOderByName(Pageable pageable) {
        return customerRepository.findByOrderByFirstName(pageable);
    }

    @Override
    public Page<Customer> findAll(Pageable pageable) {
        return customerRepository.findAll(pageable);
    }

}
