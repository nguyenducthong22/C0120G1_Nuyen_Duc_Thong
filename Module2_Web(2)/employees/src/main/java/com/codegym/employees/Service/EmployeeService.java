package com.codegym.employees.Service;


import com.codegym.employees.model.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface EmployeeService {
    Page<Employee> findAll(Pageable pageable);
    Employee findById(long id);
    void save(Employee employee);
    void deleteById(long id);
    Page<Employee> findAllByName(String search, Pageable pageable);
}
