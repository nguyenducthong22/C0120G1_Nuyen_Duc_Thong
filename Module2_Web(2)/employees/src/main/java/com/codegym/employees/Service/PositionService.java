package com.codegym.employees.Service;

import com.codegym.employees.model.Position;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface PositionService {
    Page<Position> findAll(Pageable pageable);

    Position findByid(long id);

    List<Position> findAll();
}
