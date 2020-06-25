package com.codegym.employees.Repository;

import com.codegym.employees.model.Position;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface PositionRepository extends PagingAndSortingRepository<Position,Long> {

}
