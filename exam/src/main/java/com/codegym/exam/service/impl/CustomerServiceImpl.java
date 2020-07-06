package com.codegym.exam.service.impl;

import com.codegym.exam.model.Customer;
import com.codegym.exam.repository.CustomerRepository;
import com.codegym.exam.service.CustomerService;
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
    public List<Customer> findAll() {
        return (List<Customer>) customerRepository.findAll();
    }

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
    public void save(Customer t) {
        customerRepository.save(t);
    }

    @Override
    public Page<Customer> findAllByName(String name, Pageable pageable) {
        return customerRepository.findAllByFirstNameContaining(name,pageable);
    }

    @Override
    public Page<Customer> findAllByNameAndCodeCustomer(String name, String codeCustomer, Pageable pageable) {
        return customerRepository.findAllByFirstNameContainingAndCodeCustomerContaining(name,codeCustomer,pageable);
    }
}
