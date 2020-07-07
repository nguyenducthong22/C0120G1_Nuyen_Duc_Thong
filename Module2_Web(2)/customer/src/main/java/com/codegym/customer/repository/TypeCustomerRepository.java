package com.codegym.customer.repository;

import com.codegym.customer.Model.Customer;
import com.codegym.customer.Model.TypeCustomer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface TypeCustomerRepository extends PagingAndSortingRepository<TypeCustomer,Long> {
    Page<TypeCustomer> findAllByNameContaining(String name, Pageable pageable);
}
