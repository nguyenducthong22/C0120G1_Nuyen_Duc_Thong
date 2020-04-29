package com.codygym.demo.controller;

import com.codygym.demo.Service.CustomerService;
import com.codygym.demo.entity.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @GetMapping("createCustomer")
    public ModelAndView showFormCreate() {
        return new ModelAndView("customer/createCustomer", "customer", new Customer());
    }

    @PostMapping("createCustomer")
    public ModelAndView saveCustomer(@ModelAttribute("customer") Customer customer, Pageable pageable) {
        customerService.save(customer);
        Page<Customer> customers = customerService.findAll(pageable);
        ModelAndView modelAndView = new ModelAndView("customer/listCustomer");
        modelAndView.addObject("message", "New Customer created successfully");
        modelAndView.addObject("customers", customers);
        return modelAndView;
    }
}
