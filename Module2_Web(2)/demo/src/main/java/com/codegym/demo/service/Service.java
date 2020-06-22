package com.codegym.demo.service;

import java.util.List;

public interface Service<T> {
    List<T> findAll();

    T findById(int id);

    void deleteById(int id);

    void save(T t);
}
