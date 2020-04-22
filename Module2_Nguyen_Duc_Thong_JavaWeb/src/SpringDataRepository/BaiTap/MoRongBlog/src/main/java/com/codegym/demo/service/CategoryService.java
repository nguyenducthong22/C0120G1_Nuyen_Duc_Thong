package com.codegym.demo.service;


import com.codegym.demo.model.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface CategoryService
{
    Page<Category> findAll(Pageable pageable);
    void save(Category category);
    Category findById(Long id);
    void remove(Long id);
}