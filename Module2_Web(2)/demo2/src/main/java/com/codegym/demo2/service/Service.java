package com.codegym.demo2.service;

import com.codegym.demo2.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface Service<T> {
    Page<T> findAll(Pageable pageable);

    T findById(long id);

    void save(T t);

    void remove(long id);

    Page<T> findAllByName(String name, Pageable pageable);

    Page<T> findAllOderByName(Pageable pageable);
}
