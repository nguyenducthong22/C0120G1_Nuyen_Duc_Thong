package com.codegym.employee.Repository;

import com.codegym.employee.model.Position;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface PositionRepository extends PagingAndSortingRepository<Position,Long> {

}
