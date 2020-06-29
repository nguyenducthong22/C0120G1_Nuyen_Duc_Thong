package com.codegym.employees.Service.impl;

import com.codegym.employees.Repository.PositionRepository;
import com.codegym.employees.Service.PositionService;
import com.codegym.employees.model.Position;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service
public class PositionServiceImpl implements PositionService {
    @Autowired
    PositionRepository positionRepository;

    @Override
    public Page<Position> findAll(Pageable pageable) {
        return positionRepository.findAll(pageable);
    }

    @Override
    public Position findByid(long id) {
        return positionRepository.findById(id).orElse(null);
    }

    @Override
    public List<Position> findAll() {
        return (List<Position>) positionRepository.findAll();
    }

}
