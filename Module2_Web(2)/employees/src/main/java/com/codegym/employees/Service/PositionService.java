package com.codegym.employees.Service;

import com.codegym.employees.model.Position;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface PositionService {
    Page<Position> findAll(Pageable pageable);

    Position findByid(long id);
}
