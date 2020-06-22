package com.codegym.demo.controller;

import com.codegym.demo.model.Employee;
import com.codegym.demo.service.EmployeeService;
import com.codegym.demo.service.impl.EmployeeServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class ListController {
    EmployeeService employeeService = new EmployeeServiceImpl();


    @GetMapping("/list")
    public ModelAndView list() {
        List<Employee> employees = employeeService.findAll();
        return new ModelAndView("/employee/list/listwwww", "employees", employees);
    }

    @PostMapping("/list/create-employee")
    public String listCreate(@RequestParam String newName, String newEmail, String newAddress, int newAge) {
        Employee employee = new Employee(newName, newEmail, newAddress, newAge);
        int random = (int) (Math.random() * 10000000) + 9;
        employee.setId(random);
        employeeService.save(employee);
        return "redirect:";
//        List<Employee> employees = employeeService.findAll();
//        return new ModelAndView("/employee/listwwww", "employees", employees);
    }

    //    edit
//    @GetMapping("/list/edit-employee/{id}")
//    public String listEditById(@PathVariable int id ){
//        Employee employee =employeeService.findById(id);
//        return "redirect:";
//    }
////
    @PostMapping("/list/update-employee")
    public String listUpdateEmployee(@ModelAttribute Employee employee) {
        employeeService.save(employee);
        return "redirect:";
    }

    // delete
    @PostMapping("/list/delete-employee")
    public String listDeleteEmployee() {

        return "redirect:";
    }


}
