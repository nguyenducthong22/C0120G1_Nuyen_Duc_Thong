package com.codegym.customer.validation;

import com.codegym.customer.Model.Customer;
import com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;


public class CustomerValidation implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        return Customer.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        Customer customer = (Customer) target;
        final String firstName = customer.getFirstName();
        final String lastName = customer.getLastName();
        final String phoneNumber = customer.getPhoneNumber();
//        final int age = 2020 - Integer.parseInt(customer.getBirthDay().substring(0,4));
        final String email = customer.getEmail();
        if (!(firstName.matches("^[A-Z][a-z]*$"))) {
            errors.rejectValue("firstName", "customer.firstName.length",
                    "First name is invalid");
        }
        if (!(lastName.matches("^^[A-Z][a-z]*$|^([A-Z][a-z]*)\\ [A-Z][a-z]*$|^([A-Z][a-z]*)\\ [A-Z][a-z]*\\ [A-Z][a-z]*$|^([A-Z][a-z]*)\\ [A-Z][a-z]*\\ [A-Z][a-z]*\\ [A-Z][a-z]*$|^([A-Z][a-z]*)\\ [A-Z][a-z]*\\ [A-Z][a-z]*\\ [A-Z][a-z]*\\ [A-Z][a-z]*$$"))) {
            errors.rejectValue("lastName", "customer.lastName.length",
                    "Last name is invalid");
        }
        if ( !phoneNumber.matches("^[\\d]{9,10}$")) {
            errors.rejectValue("phoneNumber", "customer.phoneNumber.invalid",
                    "Phone number is invalid");
        }
//        if (!(age >= 18)) {
//            errors.rejectValue("age", "customer.age.toSmall", "You're under 18, pls comeback" +
//                    "few years later!");
//        }
        if (!email.matches("^([\\w]+)([@])([\\w]+)(\\.)([\\w]+)$")) {
            errors.rejectValue("email", "customer.email.invalid", "Invalid email");
        }
    }
}
