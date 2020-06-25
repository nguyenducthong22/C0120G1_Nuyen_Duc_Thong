package com.codegym.employee.Repository;

import com.codegym.employee.model.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface EmployeeRepository extends PagingAndSortingRepository <Employee,Long>{
    Page<Employee> findAllByFirstNameContaining(String search, Pageable pageable);
    Page<Employee> findAllByOrderByPosition(Pageable pageable);
    Page<Employee> findAllByOrderByLevel(Pageable pageable);
}
