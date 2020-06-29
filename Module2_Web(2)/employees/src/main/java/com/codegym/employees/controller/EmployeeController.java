package com.codegym.employees.controller;

import com.codegym.employees.Service.EmployeeService;
import com.codegym.employees.Service.LevelService;
import com.codegym.employees.Service.PositionService;
import com.codegym.employees.model.Employee;
import com.codegym.employees.model.Level;
import com.codegym.employees.model.Position;
import com.codegym.employees.validation.EmployeeValidation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;

@Controller
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;
    @Autowired
    LevelService levelService;
    @Autowired
    PositionService positionService;
    @ModelAttribute("levels")
    public List<Level> getAllLevel(){
        return levelService.findAll();
    }
    @ModelAttribute("positions")
    public List<Position> getAllPosition(){
        return positionService.findAll();
    }

    @GetMapping("/employee")
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

    @GetMapping("employee/create-employee")
    public ModelAndView createEmployee(Pageable pageable){
        ModelAndView modelAndView =new ModelAndView("employee/create");
        modelAndView.addObject("employee", new Employee());
        return modelAndView;
    }

    @PostMapping("employee/create-employee")
    public  String saveEmployee(@Validated Employee employee, BindingResult result){
        new EmployeeValidation().validate(employee,result);
        if (result.hasFieldErrors()){
            return "employee/create";
        }
        employeeService.save(employee);
        return "redirect:/employee";
    }

    @GetMapping("employee/edit-employee/{id}")
    public ModelAndView editEmployee(@PathVariable long id,Pageable pageable){
        Employee employee=employeeService.findById(id);
        ModelAndView modelAndView=new ModelAndView("employee/edit");
        modelAndView.addObject("employee",employee);
        return modelAndView;
    }

    @PostMapping("employee/edit-employee")
    public String updateEmployee(@Validated Employee employee,BindingResult result){
        new EmployeeValidation().validate(employee,result);
        if (result.hasFieldErrors()){
            return "employee/edit";
        }
        employeeService.save(employee);
        return "redirect:/employee";
    }

    @GetMapping("employee/view-employee/{id}")
    public ModelAndView viewEmployee(@PathVariable long id){
        return new ModelAndView("employee/view","employee",employeeService.findById(id));
    }


}
