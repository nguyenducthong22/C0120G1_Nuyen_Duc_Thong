package com.codegym.customer.repository;

import com.codegym.customer.Model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;


public interface CustomerRepository extends PagingAndSortingRepository<Customer,Long> {
        Page<Customer> findAllByFirstNameContaining(String name, Pageable pageable);
}
