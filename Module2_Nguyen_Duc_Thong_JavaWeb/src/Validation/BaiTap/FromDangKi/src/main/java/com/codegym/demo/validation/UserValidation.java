package com.codegym.demo.validation;

import com.codegym.demo.model.User;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class UserValidation implements Validator
{
    @Override
    public boolean supports(Class<?> clazz)
    {
        return User.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors)
    {
        User user=(User)target;
        final String firstName=user.getFirstName();
        final String lastName=user.getLastName();
        final String phoneNumber=user.getPhoneNumber();
        final int age=user.getAge();
        final String email=user.getEmail();
        if(!(firstName.length()>=5&&firstName.length()<=45)){
            errors.rejectValue("firstName","user.firstName.length",
                    "First name must between 5 and 45 chars");
        }
        if(!(lastName.length()>=5&&lastName.length()<=45)){
            errors.rejectValue("lastName","user.lastName.length",
                    "Last name must between 5 and 45 chars");
        }
        if(phoneNumber.length()!=0&&!phoneNumber.matches("^[0][\\d]{9,10}$")){
            errors.rejectValue("phoneNumber","user.phoneNumber.invalid",
                    "SDT ko hop le!!! (Bat dau bang 0 va phai co 9 hoac 10 so)");
        }
        if(!(age>=18)){
            errors.rejectValue("age","user.age.toSmall","You're under 18, pls comeback" +
                    "few years later!");
        }
        if(!email.matches("^([\\w]+)([@])([\\w]+)(\\.)([\\w]+)$")){
            errors.rejectValue("email","user.email.invalid","Invalid email");
        }
    }
}

