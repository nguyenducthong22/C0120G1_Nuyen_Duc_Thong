package com.codegym.employees.validation;

import com.codegym.employees.model.Employee;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class EmployeeValidation implements Validator {
    @Override
    public boolean supports(Class<?> aClass) {
            return Employee.class.isAssignableFrom(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
            Employee employee=(Employee) o;
            final String firstName=employee.getFirstName();
            final String lastName=employee.getLastName();
            final String email=employee.getEmail();
            final String address=employee.getAddress();

        if (!(firstName.matches("^[A-Z][a-z]*$"))) {
            errors.rejectValue("firstName", "employee.firstName.length"
                   );
        }
        if (!(lastName.matches("^^[A-Z][a-z]*$|^([A-Z][a-z]*)\\ [A-Z][a-z]*$|^([A-Z][a-z]*)\\ [A-Z][a-z]*\\ [A-Z][a-z]*$|^([A-Z][a-z]*)\\ [A-Z][a-z]*\\ [A-Z][a-z]*\\ [A-Z][a-z]*$|^([A-Z][a-z]*)\\ [A-Z][a-z]*\\ [A-Z][a-z]*\\ [A-Z][a-z]*\\ [A-Z][a-z]*$$"))) {
            errors.rejectValue("lastName", "employee.lastName.length"
                    );
        }
        if (!(email.matches("^([\\w])+(\\@)([a-z])+(\\.)([a-z])+$"))){
            errors.rejectValue("email","employee.email.inValid");
        }
        if (address.matches("^\\ +$")){
            errors.rejectValue("address","employee.address.inValid");
        }
    }
}
