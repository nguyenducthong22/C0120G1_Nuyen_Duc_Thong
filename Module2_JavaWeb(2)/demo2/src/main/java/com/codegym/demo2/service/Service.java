package com.codegym.demo2.service;

import com.codegym.demo2.model.Customer;

public interface Service<T> {
    Iterable<T> findAll();
    T findById(long id);
    void save (T t);
    void remove(long id);
}
