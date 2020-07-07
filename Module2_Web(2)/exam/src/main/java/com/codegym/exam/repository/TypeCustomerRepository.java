package com.codegym.exam.repository;

import com.codegym.exam.model.TypeCustomer;
import org.springframework.data.domain.Page;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface TypeCustomerRepository extends PagingAndSortingRepository<TypeCustomer,Long> {

}

