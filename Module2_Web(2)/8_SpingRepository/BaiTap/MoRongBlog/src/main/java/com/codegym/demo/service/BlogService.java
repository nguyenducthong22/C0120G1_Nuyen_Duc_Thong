package com.codegym.demo.service;

import com.codegym.demo.model.Blog;
import com.codegym.demo.model.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface BlogService {
    Page<Blog> findAll(Pageable pageable);

    Blog findById(Long id);

    void save(Blog blog);

    void remove(Long id);

    Page<Blog> findAllByCategory(Pageable pageable, Category category);

    Page<Blog> findAllByContent(Pageable pageable, String content);

    Page<Blog> findAllThenOrderByDateCreated(Pageable pageable);

    Page<Blog> findAllWhereTitleBelike(Pageable pageable, String title);
}