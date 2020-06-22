package com.codegym.demo2.controller;

import com.codegym.demo2.model.Customer;
import com.codegym.demo2.service.CustomerService;
import com.codegym.demo2.service.TypeCustomerService;
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
public class CustomerController {

    @Autowired
    CustomerService customerService;
    @Autowired
    TypeCustomerService typeCustomerService;

    @GetMapping("/")
    public ModelAndView home(@RequestParam(name = "search", required = false) Optional<String> search
            , @PageableDefault(value = 7) Pageable pageable) {
        ModelAndView modelAndView = new ModelAndView("customer/list");
        if (search.isPresent()) {
            Page<Customer> customers = customerService.findAllByName(search.get(), pageable);
            modelAndView.addObject("customers", customers);
            modelAndView.addObject("search", search.get());
        } else {
            modelAndView.addObject("customers", customerService.findAll(pageable));
        }
        return modelAndView;
    }

    @PostMapping("/")
    public ModelAndView order(@RequestParam(name = "sortBy") String sortBy, @RequestParam(name = "search", required = false) Optional<String> search,
                              @PageableDefault(value = 7) Pageable pageable) {
        ModelAndView modelAndView = new ModelAndView("customer/list");
        if (sortBy.equals("Sort by Id")) {
            if (search.isPresent()) {
                Page<Customer> customers = customerService.findAllByName(search.get(), pageable);
                modelAndView.addObject("customers", customers);
                modelAndView.addObject("search", search.get());
            } else {
                modelAndView.addObject("customers", customerService.findAll(pageable));
            }
        } else {
            if (search.isPresent()) {
                Page<Customer> customers = customerService.findAllByName(search.get(), pageable);
                modelAndView.addObject("customers", customers);
                modelAndView.addObject("search", search.get());
            } else {
                modelAndView.addObject("customers", customerService.findAllOderByName(pageable));
            }
        }

        //co loi order xong ko search dc
        return modelAndView;
    }

    @GetMapping("/create-customer")
    public ModelAndView createCustomer(Pageable pageable) {
        ModelAndView modelAndView;
        modelAndView = new ModelAndView("customer/create");
        modelAndView.addObject("customer", new Customer());
        modelAndView.addObject("typeCustomers", typeCustomerService.findAll(pageable));
        return modelAndView;
    }

    @PostMapping("/create-customer")
    public String saveCustomer(Customer customer) {
        customer.setTypeCustomer(typeCustomerService.findById(1));
        customerService.save(customer);
        return "redirect:";
    }


    //edit
    @GetMapping("/edit-customer/{id}")
    public ModelAndView editCustomer(@PathVariable long id, Pageable pageable) {
        Customer customer = customerService.findById(id);
        ModelAndView modelAndView = new ModelAndView("customer/edit");
        modelAndView.addObject("customer", customer);
        modelAndView.addObject("typeCustomers", typeCustomerService.findAll(pageable));
        return modelAndView;
    }

    @PostMapping("/edit-customer")
    public String updateCustomer(Customer customer) {
        customerService.save(customer);
        return "redirect:";
    }


    //delete
    @GetMapping("/delete-customer/{id}")
    public ModelAndView deleteCustomer(@PathVariable long id, Pageable pageable) {
        Customer customer = customerService.findById(id);
        ModelAndView modelAndView = new ModelAndView("customer/delete");
        modelAndView.addObject("customer", customer);
        modelAndView.addObject("typeCustomers", typeCustomerService.findAll(pageable));
        return modelAndView;
    }

    @PostMapping("/delete-customer")
    public String deletedCustomer(Customer customer) {
        customerService.remove(customer.getId());
        return "redirect:";
    }

}
