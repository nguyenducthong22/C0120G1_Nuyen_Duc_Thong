package com.codegym.demo.service.impl;

import com.codegym.demo.model.Employee;
import com.codegym.demo.service.EmployeeService;
import com.codegym.demo.service.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeServiceImpl implements EmployeeService {
    private static Map<Integer, Employee> listEmployee;

    static {
        listEmployee = new HashMap<>();
        listEmployee.put(1, new Employee(1, "Quy", "Quy@gamil.com", "Da Nang", 10));
        listEmployee.put(2, new Employee(2, "Hồn", "Hon@gamil.com", "Ben Tre", 20));
        listEmployee.put(3, new Employee(3, "Cực", "Cuc@gamil.com", "Binh Dinh", 30));
        listEmployee.put(4, new Employee(4, "Lạc", "Lac@gamil.com", "Da Nang", 40));
        listEmployee.put(5, new Employee(5, "Cưỡi", "Cuoi@gamil.com", "Quang Nam", 50));
        listEmployee.put(6, new Employee(6, "Hạc", "Hac@gamil.com", "Nghe An", 60));
        listEmployee.put(7, new Employee(7, "Thăng", "Thang@gamil.com", "Quang Ngai", 70));
        listEmployee.put(8, new Employee(8, "Thiên", "Thien@gamil.com", "Vinh Long", 80));
    }

    @Override
    public List findAll() {
        return new ArrayList<>(listEmployee.values());
    }

    @Override
    public Employee findById(int id) {
        return listEmployee.get(id);
    }

    @Override
    public void deleteById(int id) {
        listEmployee.remove(id);
    }

    @Override
    public void save(Employee employee) {
        listEmployee.put(employee.getId(), employee);
    }
}


