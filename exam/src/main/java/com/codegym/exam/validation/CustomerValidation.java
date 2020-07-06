package com.codegym.exam.validation;


import com.codegym.exam.model.Customer;
import com.codegym.exam.model.TypeCustomer;
import com.codegym.exam.service.CustomerService;
import com.codegym.exam.service.TypeCustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import java.util.Date;
import java.util.List;


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
        final String idCard = customer.getIdCard();
        final String email = customer.getEmail();
        final String sex=customer.getSex().toLowerCase().trim();
        final String codeCustomer=customer.getCodeCustomer();


        Date date=new Date();

        final String birthDay =  customer.getBirthDay();

        if (!(firstName.matches("^[A-Z][a-z]*$"))) {
            errors.rejectValue("firstName", "customer.firstName.length",
                    "First name is invalid");
        }
        if (!(lastName.matches("^^[A-Z][a-z]*$|^([A-Z][a-z]*)\\ [A-Z][a-z]*$|^([A-Z][a-z]*)\\ [A-Z][a-z]*\\ [A-Z][a-z]*$|^([A-Z][a-z]*)\\ [A-Z][a-z]*\\ [A-Z][a-z]*\\ [A-Z][a-z]*$|^([A-Z][a-z]*)\\ [A-Z][a-z]*\\ [A-Z][a-z]*\\ [A-Z][a-z]*\\ [A-Z][a-z]*$$"))) {
            errors.rejectValue("lastName", "customer.lastName.length");
        }
        if ( !phoneNumber.matches("^([0-9]{4})(\\.)([0-9]{3})(\\.)([0-9]{3})$")) {
            errors.rejectValue("phoneNumber", "customer.phoneNumber.invalid"
                 );
        }
        if ( !idCard.matches("^[\\d]{9,10}$")) {
            errors.rejectValue("idCard", "customer.idCard.invalid"
            );
        }
        if (!codeCustomer.matches("^([K][H])([0-9]{4})$")) {
            errors.rejectValue("codeCustomer", "customer.codeCustomer.invalid");
        }
//        boolean check=false;
//        for (Customer value : listCustomer) {
//            if (codeCustomer.equals(value.getCodeCustomer())) {
//                check = true;
//                break;
//            }
//        }
//
//        if (check=true){
//            errors.rejectValue("codeCustomer","customer.codeCustomer.exists");
//        }


        if (!email.matches("^([\\w]+)([@])([\\w]+)(\\.)([\\w]+)$")) {
            errors.rejectValue("email", "customer.email.invalid");
        }

        if (!(sex.equals("male")|sex.equals("female")|sex.equals("unknown"))){
            errors.rejectValue("sex","customer.sex.invalid");
        }
    }
}
