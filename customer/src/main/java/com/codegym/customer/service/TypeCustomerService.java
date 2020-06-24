package com.codegym.customer.service;

import com.codegym.customer.Model.TypeCustomer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface TypeCustomerService  {
    Page<TypeCustomer> findAll(Pageable pageable);
    TypeCustomer findById(long id);
    void remove(long id);
    void save(TypeCustomer t);
    Page<TypeCustomer> findAllByName(String name,Pageable pageable);
    List<TypeCustomer> findAll();
}
