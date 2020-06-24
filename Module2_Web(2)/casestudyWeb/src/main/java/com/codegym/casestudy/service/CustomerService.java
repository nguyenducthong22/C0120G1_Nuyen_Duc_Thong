package com.codegym.casestudy.service;

import com.codegym.casestudy.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CustomerService  {
    Page<Customer>findAll(Pageable pageable);
    Customer findById(long id);
    void save(Customer customer);
    void deleteById(long id);
    Page<Customer>findAllByName(String name,Pageable pageable);
    Page<Customer> findAllOderByName(Pageable pageable);
}
