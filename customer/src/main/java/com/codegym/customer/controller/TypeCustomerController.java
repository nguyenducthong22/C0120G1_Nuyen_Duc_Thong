package com.codegym.customer.controller;

import com.codegym.customer.Model.TypeCustomer;
import com.codegym.customer.service.TypeCustomerService;
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
public class TypeCustomerController {
    @Autowired
    TypeCustomerService typeCustomerService;

    @GetMapping("/list-type-customer")
    public ModelAndView home(@RequestParam(name = "searchType", required = false) Optional<String> search, @PageableDefault(value = 5) Pageable pageable) {
        ModelAndView modelAndView = new ModelAndView("typeCustomer/list");
        if (search.isPresent()) {
            Page<TypeCustomer> typeCustomers = typeCustomerService.findAllByName(search.get(), pageable);
            modelAndView.addObject("typeCustomers", typeCustomers);
            modelAndView.addObject("search", search.get());
        } else {
            modelAndView.addObject("typeCustomers", typeCustomerService.findAll(pageable));
        }
        return modelAndView;
    }

    @PostMapping("/create-type-customer")
    public String createTypeCustomer(@RequestParam String newName, String newDescription) {
        TypeCustomer typeCustomer = new TypeCustomer();
        typeCustomer.setName(newName);
        typeCustomer.setDescription(newDescription);
        typeCustomerService.save(typeCustomer);
        return "redirect:list-type-customer";
    }

    @GetMapping("/edit-type-customer/{id}")
    public ModelAndView editTypeCustomer(@PathVariable long id) {
        ModelAndView modelAndView = new ModelAndView("typeCustomer/edit");
        modelAndView.addObject("typeCustomer", typeCustomerService.findById(id));
        return modelAndView;
    }

    @PostMapping("/edit-type-customer")
    public String update(TypeCustomer typeCustomer) {
        typeCustomerService.save(typeCustomer);
        return "redirect:list-type-customer";
    }
}