package com.codegym.employee.Service.impl;

import com.codegym.employee.Repository.EmployeeRepository;
import com.codegym.employee.Service.EmployeeService;
import com.codegym.employee.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Transactional
@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public Page<Employee> findAll(Pageable pageable) {
        return employeeRepository.findAll(pageable);
    }

    @Override
    public Employee findById(long id) {
        return employeeRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public void deleteById(long id) {
    employeeRepository.deleteById(id);
    }

    @Override
    public Page<Employee> findAllByName(String search, Pageable pageable) {
        return employeeRepository.findAllByFirstNameContaining(search,pageable);
    }

    @Override
    public Page<Employee> oderByLevel(Pageable pageable) {
        return employeeRepository.findAllByOrderByLevel(pageable);
    }

    @Override
    public Page<Employee> oderByPosition(Pageable pageable) {
        return employeeRepository.findAllByOrderByPosition(pageable);
    }
}
