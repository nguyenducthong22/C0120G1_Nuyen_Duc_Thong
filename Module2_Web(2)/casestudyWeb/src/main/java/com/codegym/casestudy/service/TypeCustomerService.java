package com.codegym.casestudy.service;

import com.codegym.casestudy.model.TypeCustomer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface TypeCustomerService {
    Page<TypeCustomer> findAll(Pageable pageable);
    void save(TypeCustomer typeCustomer);
    TypeCustomer findById(long id);
    Page<TypeCustomer> findAllByName(String s, Pageable pageable);
}
