package com.codegym.employee.Service;


import com.codegym.employee.model.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface EmployeeService {
    Page<Employee> findAll(Pageable pageable);
    Employee findById(long id);
    void save(Employee employee);
    void deleteById(long id);
    Page<Employee> findAllByName(String search, Pageable pageable);
    Page<Employee> oderByLevel(Pageable pageable);
    Page<Employee> oderByPosition(Pageable pageable);
}
