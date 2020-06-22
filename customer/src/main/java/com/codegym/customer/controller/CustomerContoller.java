package com.codegym.customer.controller;

import com.codegym.customer.Model.Customer;
import com.codegym.customer.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.swing.text.html.Option;
import java.util.Optional;

@Controller
public class CustomerContoller {
    @Autowired
    CustomerService customerService;

    @GetMapping("/")
    public ModelAndView home(@RequestParam(name = "search", required = false) Optional<String> search, @PageableDefault(value = 5) Pageable pageable) {
        ModelAndView modelAndView = new ModelAndView("customer/list");
        if (search.isPresent()) {
            Page<Customer> customers = customerService.findAllByName(search.get(), pageable);
            modelAndView.addObject("customers", customers);
            modelAndView.addObject("search",search.get());
        }else {
            modelAndView.addObject("customers",customerService.findAll(pageable));
        }
        return modelAndView;
    }


}
