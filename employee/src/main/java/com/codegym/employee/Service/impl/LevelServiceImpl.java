package com.codegym.employee.Service.impl;

import com.codegym.employee.Repository.LevelRepository;
import com.codegym.employee.Service.LevelService;
import com.codegym.employee.model.Level;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Transactional
@Service
public class LevelServiceImpl implements LevelService {
    @Autowired
    LevelRepository levelRepository;

    @Override
    public Page<Level> findAll(Pageable pageable) {
        return levelRepository.findAll(pageable);
    }

    @Override
    public Level findById(long id) {
        return levelRepository.findById(id).orElse(null);
    }
}
