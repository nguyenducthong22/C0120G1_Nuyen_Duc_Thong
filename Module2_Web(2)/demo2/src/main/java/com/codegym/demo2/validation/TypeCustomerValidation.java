package com.codegym.demo2.validation;

import com.codegym.demo2.model.TypeCustomer;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class TypeCustomerValidation implements Validator {
    @Override
    public boolean supports(Class<?> aClass) {
        return  TypeCustomer.class.isAssignableFrom(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
        TypeCustomer typeCustomer=(TypeCustomer) o;

    }
}
