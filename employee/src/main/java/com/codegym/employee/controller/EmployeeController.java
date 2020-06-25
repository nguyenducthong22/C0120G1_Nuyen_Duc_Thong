package com.codegym.employee.controller;

import com.codegym.employee.Service.EmployeeService;
import com.codegym.employee.Service.LevelService;
import com.codegym.employee.Service.PositionService;
import com.codegym.employee.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;
    @Autowired
    LevelService levelService;
    @Autowired
    PositionService positionService;

    @GetMapping("/")
    public ModelAndView employeeHome(@RequestParam(name = "search", required = false) Optional<String> search, @PageableDefault(value = 5) Pageable pageable) {
        ModelAndView modelAndView = new ModelAndView("employee/list");
        if (search.isPresent()) {
            Page<Employee> employees = employeeService.findAllByName(search.get(), pageable);
            modelAndView.addObject("employees", employees);
            modelAndView.addObject("search", search.get());
        } else {
            modelAndView.addObject("employees", employeeService.findAll(pageable));
        }
        return modelAndView;
    }

    @GetMapping("create-employee")
    public ModelAndView createEmployee(Pageable pageable){
        ModelAndView modelAndView =new ModelAndView("employee/create");
        modelAndView.addObject("employee", new Employee());
        modelAndView.addObject("levels",levelService.findAll(pageable));
        modelAndView.addObject("positions",positionService.findAll(pageable));
        return modelAndView;
    }

    @PostMapping("create-employee")
    public  String saveEmployee(Employee employee){
        employeeService.save(employee);
        return "redirect:";
    }



}
