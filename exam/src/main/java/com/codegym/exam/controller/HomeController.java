package com.codegym.exam.controller;

import com.codegym.exam.model.Customer;
import com.codegym.exam.model.TypeCustomer;
import com.codegym.exam.service.CustomerService;
import com.codegym.exam.service.TypeCustomerService;
import com.codegym.exam.validation.CustomerValidation;
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
@RequestMapping("/customer")
public class HomeController {
    @Autowired
    CustomerService customerService;
    @Autowired
    TypeCustomerService typeCustomerService;

    @ModelAttribute("typeCustomers")
    public List<TypeCustomer> getAll(){
        return typeCustomerService.findAll();
    }

//    @GetMapping("/search")
//    public ModelAndView home2(@RequestParam(name = "search", required = false,defaultValue = "")String search,@RequestParam(name = "search2", required = false,defaultValue = "")String search2, @PageableDefault(value = 5) Pageable pageable) {
//        ModelAndView modelAndView = new ModelAndView("customer/list");
//
//            modelAndView.addObject("customers",customerService.findAllByNameAndCodeCustomer(search,search2,pageable));
//
//        return modelAndView;
//    }

    @GetMapping("")
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

    @GetMapping("/create-customer")
    public ModelAndView createCustomer() {
        ModelAndView modelAndView;
        modelAndView = new ModelAndView("customer/create");
        modelAndView.addObject("customer", new Customer());
        return modelAndView;
    }

    @PostMapping("/save-customer")
    public String saveCustomer(@Validated Customer customer, BindingResult result) {
        new CustomerValidation().validate(customer,result);
        if (result.hasFieldErrors()){
            return "customer/create";
        }
        customerService.save(customer);
        return "redirect:";
    }

    @GetMapping("/edit-customer/{id}")
    public ModelAndView editCustomer(@PathVariable long id ) {
        Customer customer = customerService.findById(id);
        ModelAndView modelAndView = new ModelAndView("customer/edit");
        modelAndView.addObject("customer", customer);
        modelAndView.addObject("typeCustomers", typeCustomerService.findAll());
        return modelAndView;
    }

    @PostMapping("/edit-customer")
    public String updateCustomer(@Validated Customer customer,BindingResult result) {
        new CustomerValidation().validate(customer,result);
        if (result.hasFieldErrors()){
            return "customer/edit";
        }
        customerService.save(customer);
        return "redirect:";
    }


    //delete
    @GetMapping("/delete-customer/{id}")
    public ModelAndView deleteCustomer(@PathVariable long id ) {
        Customer customer = customerService.findById(id);
        ModelAndView modelAndView = new ModelAndView("customer/delete");
        modelAndView.addObject("customer", customer);
        return modelAndView;
    }

    @PostMapping("/delete-customer")
    public String deletedCustomer(Customer customer) {
        customerService.remove(customer.getId());
        return "redirect:";
    }

    @GetMapping("/view-customer/{id}")
    public ModelAndView viewCustomer(@PathVariable long id){
        return new ModelAndView("customer/view","customer",customerService.findById(id));
    }

}
