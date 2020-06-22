package com.codegym.demo2.repository;

import com.codegym.demo2.model.Customer;
import com.codegym.demo2.model.TypeCustomer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface CustomerRepository extends PagingAndSortingRepository<Customer, Long> {

    List<Customer> findAllByTypeCustomer(TypeCustomer typeCustomer);

    Page<Customer> findAllByFirstNameContaining(String name, Pageable pageable);

    Page<Customer> findByOrderByFirstName(Pageable page);

    Page<Customer> findAll(Pageable pageable);
}
