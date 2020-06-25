package com.codegym.employee.Service.impl;

import com.codegym.employee.Repository.PositionRepository;
import com.codegym.employee.Service.PositionService;
import com.codegym.employee.model.Position;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

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

}
