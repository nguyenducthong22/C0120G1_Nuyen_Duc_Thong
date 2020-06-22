package com.codegym.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CalculatorController {
    @GetMapping("/home")
    public String home() {
        return "home";
    }

    @PostMapping("/calculator")
    public ModelAndView calculator(@RequestParam String opera1, String opera2, String opera) {
        ModelAndView modelAndView;
        float operaFirst = 0;
        float operaSecond = 0;
        float result;

        try {
            operaFirst = Float.parseFloat(opera1);
        } catch (Exception e) {
            return new ModelAndView("home", "massage", "Invalid !!!");
        }

        try {
            operaSecond = Float.parseFloat(opera2);
        } catch (Exception e) {
            return new ModelAndView("home", "massage", "Invalid !!!");
        }

        if (opera.equals("Addition(+)")) {
            result = operaFirst + operaSecond;
            String string = operaFirst + " + " + operaSecond + " = " + result;
            return new ModelAndView("home", "result", string);
        } else if (opera.equals("Subtraction(-)")) {
            result = operaFirst - operaSecond;
            String string = operaFirst + " - " + operaSecond + " = " + result;
            return new ModelAndView("home", "result", string);
        } else if (opera.equals("Multiplication(*)")) {
            result = operaFirst * operaSecond;
            String string = operaFirst + " * " + operaSecond + " = " + result;
            return new ModelAndView("home", "result", string);
        } else if (opera.equals("Division(/)") && opera2.equals("0")) {
            return new ModelAndView("home", "massage", "Invalid !!!");
        } else {
            result = operaFirst / operaSecond;
            String string = operaFirst + " / " + operaSecond + " = " + result;
            return new ModelAndView("home", "result", string);
        }
    }
}
