package com.codegym.demo2.service.impl;

import com.codegym.demo2.model.Customer;
import com.codegym.demo2.model.TypeCustomer;
import com.codegym.demo2.repository.CustomerRepository;
import com.codegym.demo2.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Transactional
@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    CustomerRepository customerRepository;

    @Override
    public Iterable<Customer> findAll() {
        return customerRepository.findAll();
    }

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
    public Iterable<Customer> findAllByTypeCustomer(TypeCustomer typeCustomer) {
        return customerRepository.findAllByTypeCustomer(typeCustomer);
    }
}
