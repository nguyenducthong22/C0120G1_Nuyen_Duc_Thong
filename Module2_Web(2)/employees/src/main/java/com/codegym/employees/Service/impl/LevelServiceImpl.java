package com.codegym.employees.Service.impl;

import com.codegym.employees.Repository.LevelRepository;
import com.codegym.employees.Service.LevelService;
import com.codegym.employees.model.Level;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

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

    @Override
    public List<Level> findAll() {
        return (List<Level>) levelRepository.findAll();
    }
}
