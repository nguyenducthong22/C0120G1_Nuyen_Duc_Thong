package com.codegym.quanlikhachhangsb.controller;

import com.codegym.quanlikhachhangsb.model.Customer;
import com.codegym.quanlikhachhangsb.service.CustomerService;
import com.codegym.quanlikhachhangsb.service.impl.CustomerServiecImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @GetMapping("list-customer")
    public ModelAndView listCustomer() {
        List<Customer> customers = customerService.findAll();
        ModelAndView modelAndView = new ModelAndView("/customer/list");
        modelAndView.addObject("customers", customers);
        return modelAndView;
    }

    @GetMapping("/create-customer")
    public ModelAndView showCreateForm() {
        ModelAndView modelAndView = new ModelAndView("/customer/create");
        modelAndView.addObject("customer", new Customer());
        return modelAndView;
    }

    @PostMapping("/create-customer")
    public ModelAndView saveCustomer(@ModelAttribute("customer") Customer customer) {
        customerService.save(customer);
        ModelAndView modelAndView = new ModelAndView("/customer/create");
        modelAndView.addObject("customer", new Customer());
        modelAndView.addObject("message", "Create customer successfully!!!");
        return modelAndView;
    }

    @GetMapping("/edit-customer/{id}")
    public ModelAndView showEditForm(@PathVariable Long id) {
        Customer customer = customerService.findById(id);
        if (customer != null) {
            ModelAndView modelAndView = new ModelAndView("/customer/edit");
            modelAndView.addObject("customer", customer);
            return modelAndView;
        } else {
            ModelAndView modelAndView = new ModelAndView("/customer/error.404");
            return modelAndView;
        }

    }

    @PostMapping("/edit-customer")
    public ModelAndView updateCustomer(@ModelAttribute("blog") Customer customer) {
        customerService.save(customer);
        ModelAndView modelAndView = new ModelAndView("/customer/edit");
        modelAndView.addObject("customer", customer);
        modelAndView.addObject("message", "Edit customer Successfully!!!");
        return modelAndView;
    }

    @GetMapping("/delete-customer/{id}")

    public ModelAndView deleteFormCustomer(@PathVariable Long id) {
        Customer customer = customerService.findById(id);
        ModelAndView modelAndView = new ModelAndView("/customer/delete");
        modelAndView.addObject("customer", customer);
        return modelAndView;
    }

    @PostMapping("/delete-customer")
    public ModelAndView deleteCustomer(@ModelAttribute("customer") Customer customer) {
        customerService.remove(customer.getId());
        ModelAndView modelAndView = new ModelAndView("/customer/delete");
        modelAndView.addObject("message", "delete customer successfully!!");
        return modelAndView;
    }

}