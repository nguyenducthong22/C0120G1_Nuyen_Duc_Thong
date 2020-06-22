package com.codegym.demo.service.impl;

import com.codegym.demo.model.User;
import com.codegym.demo.repository.UserRepository;
import com.codegym.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public Iterable<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElse(null);
    }


    @Override
    public void save(User user) {
        userRepository.save(user);
    }


    @Override
    public void remove(Long id) {
        userRepository.deleteById(id);

    }

}