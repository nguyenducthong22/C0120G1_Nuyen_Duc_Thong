package com.codegym.exam.repository;

import com.codegym.exam.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CustomerRepository extends PagingAndSortingRepository<Customer,Long> {
    Page<Customer> findAllByFirstNameContaining(String name, Pageable pageable);
   Page<Customer> findAllByFirstNameContainingAndCodeCustomerContaining(String firstName, String codeCustomer, Pageable pageable);

}
