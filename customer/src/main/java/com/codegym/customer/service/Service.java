package com.codegym.customer.service;

import com.codegym.customer.Model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface Service<T> {
    Page<T>findAll(Pageable pageable);
    T findById(long id);
    void remove(long id);
    void save(T t);
    Page<T> findAllByName(String name,Pageable pageable);
}
