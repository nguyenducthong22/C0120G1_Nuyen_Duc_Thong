package com.codegym.customer.service;

import com.codegym.customer.Model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CustomerService   {
    Page<Customer>findAll(Pageable pageable);
    Customer findById(long id);
    void remove(long id);
    void save(Customer t);
    Page<Customer> findAllByName(String name,Pageable pageable);
    Page<Customer> findAllOderByName(Pageable pageable);
    Page<Customer> findAllByNameOrAddress(String search,String address,Pageable pageable);
}
