package com.codegym.demo.controller;

import com.codegym.demo.model.User;
import com.codegym.demo.service.UserService;
import com.codegym.demo.validation.UserValidation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.Optional;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public String users(Model model) {
        model.addAttribute("users", userService.findAll());
        return "users";
    }

    @GetMapping("/users/register")
    public ModelAndView register() {
        return new ModelAndView("register", "user", new User());
    }

    @PostMapping("/users")
    public String users(@Valid User user, BindingResult result, RedirectAttributes redirectAttributes) {
        new UserValidation().validate(user, result);
        if (result.hasFieldErrors()) {
            return "register";
        }
        userService.save(user);
        redirectAttributes.addFlashAttribute("status", "");
        return "redirect:/users";
    }

    @GetMapping("edit-user/{id}")
    public ModelAndView showEditForm(@PathVariable Long id) {
        ModelAndView modelAndView;
        User user = userService.findById(id);
        if (user != null) {
            modelAndView = new ModelAndView("/edit");
            modelAndView.addObject("user", user);
        } else {
            modelAndView = new ModelAndView("/error.404");
        }
        return modelAndView;
    }

    @PostMapping("/edit-user")
    public String usersedit(@Valid User user, BindingResult result, RedirectAttributes redirectAttributes) {
        new UserValidation().validate(user, result);
        if (result.hasFieldErrors()) {
            return "register";
        }
        userService.save(user);
        redirectAttributes.addFlashAttribute("status", "");
        return "redirect:/users";
    }

    @GetMapping("delete-user/{id}")
    public ModelAndView showDeleteForm(@PathVariable Long id) {
        ModelAndView modelAndView;
        User user = userService.findById(id);
        if (user != null) {
            modelAndView = new ModelAndView("/delete");
            modelAndView.addObject("user", user);
        } else {
            modelAndView = new ModelAndView("/error.404");
        }
        return modelAndView;
    }

    @PostMapping("/delete-user")
    public String deleteUser(@ModelAttribute("user") User user) {
        userService.remove(user.getId());
        return "redirect:/users";
    }
}