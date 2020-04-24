package com.codegym.demo.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import com.codegym.demo.model.Blog;
import com.codegym.demo.model.Category;

public interface BlogService {
    Page<Blog> findAll( Pageable pageable);

    Blog findById(Long id);

    void save(Blog blog);

    void remove(Long id);



    Page<Blog> findAllByNameContaining(String name, Pageable pageable);

    Page<Blog> findAllByCategory(Category category, Pageable pageable);
    Page<Blog> findByCategory_Id(Long id , Pageable pageable);

}