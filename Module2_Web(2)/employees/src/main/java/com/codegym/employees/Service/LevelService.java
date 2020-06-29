package com.codegym.employees.Service;

import com.codegym.employees.model.Level;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface LevelService {
    Page<Level> findAll(Pageable pageable);
    Level findById(long id);

    List<Level> findAll();
}
