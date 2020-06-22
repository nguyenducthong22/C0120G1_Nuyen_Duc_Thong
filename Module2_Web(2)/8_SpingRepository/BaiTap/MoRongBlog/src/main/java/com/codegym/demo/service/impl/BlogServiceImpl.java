package com.codegym.demo.service.impl;

import com.codegym.demo.model.Blog;
import com.codegym.demo.model.Category;
import com.codegym.demo.repository.BlogRepository;
import com.codegym.demo.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Transactional
@Service
public class BlogServiceImpl implements BlogService {
    @Autowired
    private BlogRepository blogRepository;

    @Override
    public Page<Blog> findAll(Pageable pageable) {
        return blogRepository.findAll(pageable);
    }

    @Override
    public Blog findById(Long id) {
        return blogRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Blog blog) {
        blogRepository.save(blog);
    }

    @Override
    public void remove(Long id) {
        blogRepository.deleteById(id);
    }

    @Override
    public Page<Blog> findAllByCategory(Pageable pageable, Category category) {
        return blogRepository.findAllByCategory(pageable, category);
    }

    @Override
    public Page<Blog> findAllByContent(Pageable pageable, String content) {
        return blogRepository.findAllByContent(pageable, content);
    }

    @Override
    public Page<Blog> findAllThenOrderByDateCreated(Pageable pageable) {
        return blogRepository.findAllThenOrderByDateCreated(pageable);
    }

    @Override
    public Page<Blog> findAllWhereTitleBelike(Pageable pageable, String title) {
        return blogRepository.findAllWhereTitleBelike(pageable, title);
    }

}