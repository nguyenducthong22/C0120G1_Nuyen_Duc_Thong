package com.codegym.demo2.repository;

import com.codegym.demo2.model.Customer;
import com.codegym.demo2.model.TypeCustomer;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface  CustomerRepository extends PagingAndSortingRepository<Customer, Long> {

    Iterable<Customer>  findAllByTypeCustomer(TypeCustomer typeCustomer);
}
