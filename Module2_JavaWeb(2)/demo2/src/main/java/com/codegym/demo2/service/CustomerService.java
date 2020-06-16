package com.codegym.demo2.service;

import com.codegym.demo2.model.Customer;
import com.codegym.demo2.model.TypeCustomer;

public interface CustomerService extends Service<Customer> {
    Iterable<Customer> findAllByTypeCustomer(TypeCustomer typeCustomer);
}
