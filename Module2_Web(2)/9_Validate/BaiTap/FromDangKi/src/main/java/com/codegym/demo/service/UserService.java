package com.codegym.demo.service;

import com.codegym.demo.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


public interface UserService {
    Iterable<User> findAll();

    User findById(Long id);

    void save(User user);

    void remove(Long id);
}
