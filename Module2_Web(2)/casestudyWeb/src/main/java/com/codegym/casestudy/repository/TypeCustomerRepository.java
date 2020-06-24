package com.codegym.casestudy.repository;

import com.codegym.casestudy.model.TypeCustomer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface TypeCustomerRepository extends PagingAndSortingRepository<TypeCustomer,Long> {
    Page<TypeCustomer> findAllByNameContaining(String name, Pageable pageable);
}
