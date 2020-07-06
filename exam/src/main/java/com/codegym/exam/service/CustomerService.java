package com.codegym.exam.service;

import com.codegym.exam.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface CustomerService  {
    List<Customer>findAll();
    Page<Customer> findAll(Pageable pageable);
    Customer findById(long id);
    void remove(long id);
    void save(Customer t);
    Page<Customer> findAllByName(String name,Pageable pageable);
    Page<Customer> findAllByNameAndCodeCustomer(String name,String codeCustomer,Pageable pageable);
}

