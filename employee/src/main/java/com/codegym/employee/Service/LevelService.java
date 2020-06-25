package com.codegym.employee.Service;

import com.codegym.employee.model.Level;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface LevelService {
    Page<Level> findAll(Pageable pageable);
    Level findById(long id);
}
