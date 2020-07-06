package com.codegym.customer.service.impl;

import com.codegym.customer.Model.Customer;
import com.codegym.customer.repository.CustomerRepository;
import com.codegym.customer.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Transactional
@Service
public class CusTomerServiceImpl implements CustomerService {
    @Autowired
    CustomerRepository customerRepository;
    @Override
    public Page<Customer> findAll(Pageable pageable) {
        return customerRepository.findAll(pageable);
    }

    @Override
    public Customer findById(long id) {
        return customerRepository.findById(id).orElse(null);
    }

    @Override
    public void remove(long id) {
        customerRepository.deleteById(id);
    }

    @Override
    public void save(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public Page<Customer> findAllByName(String name,Pageable pageable) {
        return customerRepository.findAllByFirstNameContaining(name,pageable);
    }

    @Override
    public Page<Customer> findAllOderByName(Pageable pageable) {
        return customerRepository.findAllByOrderByFirstName(pageable);
    }

    @Override
    public Page<Customer> findAllByNameOrAddress(String name,String address, Pageable pageable) {
        return customerRepository.findAllByFirstNameContainingOrAddressContaining(name,address,pageable);
    }
}
