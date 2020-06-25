package com.codegym.employees.Repository;

import com.codegym.employees.model.Level;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface LevelRepository extends PagingAndSortingRepository<Level,Long> {

}
