package com.codegym.demo.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import com.codegym.demo.model.Category;

public interface CategoryRepository extends PagingAndSortingRepository<Category, Long> {
    Page<Category> findAllByNameContaining(String name, Pageable pageable);
}