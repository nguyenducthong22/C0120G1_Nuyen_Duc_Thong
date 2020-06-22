package com.codegym.demo.controller;

import com.codegym.demo.model.Employee;
import com.codegym.demo.service.EmployeeService;
import com.codegym.demo.service.impl.EmployeeServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class EmployeeController {
    private EmployeeService employeeService = new EmployeeServiceImpl();

    @GetMapping("/employee")
    public ModelAndView homeEmployee() {
        List<Employee> employees = employeeService.findAll();
        return new ModelAndView("/employee/list", "employees", employees);
    }


    // Create Employee
    @GetMapping("/create-employee")
    public ModelAndView createEmployee() {
        return new ModelAndView("employee/create");
    }

    @PostMapping("/save-employee")
    public String saveEmployee(@RequestParam String name, String email, String address, int age, RedirectAttributes redirectAttributes) {
        Employee employee = new Employee(name, email, address, age);
        int random = (int) (Math.random() * 10000000) + 9;
        employee.setId(random);
        employeeService.save(employee);
        redirectAttributes.addFlashAttribute("message", "Create employee " + employee.getName() + " successful!!");
        return "redirect:employee";
    }

    // edit Employee
    @GetMapping("/edit-employee/{id}")
    public ModelAndView editEmployee(@PathVariable int id) {
        Employee employee = employeeService.findById(id);
        return new ModelAndView("employee/edit", "employee", employee);
    }

    @PostMapping("/update-employee")
    public String updateEmployee(@ModelAttribute Employee employee, RedirectAttributes redirectAttributes) {
        employeeService.save(employee);
        redirectAttributes.addFlashAttribute("message", "Edit employee " + employee.getName() + " successful!!!");
        return "redirect:employee";
    }

    //delete Employee
    @GetMapping("delete-employee/{id}")
    public ModelAndView deleteEmployee(@PathVariable int id) {
        Employee employee = employeeService.findById(id);
        return new ModelAndView("employee/delete", "employee", employee);
    }

    @PostMapping("deleted-employee")
    public String deletedEmployee(@RequestParam int id, RedirectAttributes redirectAttributes) {
        employeeService.deleteById(id);
        redirectAttributes.addFlashAttribute("message", "Delete successful!!!");
        return "redirect:employee";
    }


}
