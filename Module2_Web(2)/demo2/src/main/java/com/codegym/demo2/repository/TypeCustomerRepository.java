package com.codegym.demo2.repository;

import com.codegym.demo2.model.Customer;
import com.codegym.demo2.model.TypeCustomer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface TypeCustomerRepository extends PagingAndSortingRepository<TypeCustomer, Long> {
    Page<TypeCustomer> findAllByNameContaining(String name, Pageable pageable);

    Page<TypeCustomer> findByOrderByName(Pageable page);

    Page<TypeCustomer> findAll(Pageable pageable);
}
