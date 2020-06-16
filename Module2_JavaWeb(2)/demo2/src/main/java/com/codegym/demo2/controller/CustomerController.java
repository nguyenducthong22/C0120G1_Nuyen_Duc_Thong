package com.codegym.demo2.controller;

import com.codegym.demo2.model.Customer;
import com.codegym.demo2.service.CustomerService;
import com.codegym.demo2.service.TypeCustomerService;
import com.codegym.demo2.service.impl.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CustomerController {


    @Autowired
    CustomerService customerService;
    @GetMapping("/")
    public ModelAndView home(){
        Iterable<Customer> customers=customerService.findAll();
        ModelAndView modelAndView;
        return new ModelAndView("customer/list","customers",customers);

    }



}
