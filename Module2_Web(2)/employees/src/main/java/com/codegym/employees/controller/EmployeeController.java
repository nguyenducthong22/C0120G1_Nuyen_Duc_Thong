package com.codegym.employees.controller;

import com.codegym.employees.Service.EmployeeService;
import com.codegym.employees.Service.LevelService;
import com.codegym.employees.Service.PositionService;
import com.codegym.employees.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
    public ModelAndView employeeHome(@RequestParam(name = "search", required = false) Optional<String> search, @PageableDefault(value = 6) Pageable pageable) {
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

    @GetMapping("/create-employee")
    public ModelAndView createEmployee(Pageable pageable){
        ModelAndView modelAndView =new ModelAndView("employee/create");
        modelAndView.addObject("employee", new Employee());
        modelAndView.addObject("levels",levelService.findAll(pageable));
        modelAndView.addObject("positions",positionService.findAll(pageable));
        return modelAndView;
    }

    @PostMapping("/create-employee")
    public  String saveEmployee(Employee employee){
        employeeService.save(employee);
        return "redirect:";
    }

    @GetMapping("/edit-employee/{id}")
    public ModelAndView editEmployee(@PathVariable long id,Pageable pageable){
        Employee employee=employeeService.findById(id);
        ModelAndView modelAndView=new ModelAndView("employee/edit");
        modelAndView.addObject("employee",employee);
        modelAndView.addObject("levels",levelService.findAll(pageable));
        modelAndView.addObject("positions",positionService.findAll(pageable));
        return modelAndView;
    }

    @PostMapping("/edit-employee")
    public String updateEmployee(Employee employee){
        employeeService.save(employee);
        return "redirect:";
    }

    @GetMapping("/view-employee/{id}")
    public ModelAndView viewEmployee(@PathVariable long id){
        return new ModelAndView("employee/view","employee",employeeService.findById(id));
    }




}
