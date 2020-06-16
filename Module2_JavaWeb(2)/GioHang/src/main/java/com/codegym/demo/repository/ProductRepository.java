package com.codegym.demo.repository;

import com.codegym.demo.model.Product;
import org.springframework.data.repository.PagingAndSortingRepository;


import java.util.List;

public interface ProductRepository extends PagingAndSortingRepository<Product,Long> {
    List<Product> findAll();
}