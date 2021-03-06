package com.codegym.customer.formatter;


import com.codegym.customer.Model.TypeCustomer;
import com.codegym.customer.service.TypeCustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.util.Locale;

@Component
public class TypeCustomerFormatter implements Formatter<TypeCustomer> {

    @Autowired
    TypeCustomerService typeCustomerService;


    @Override
    public String print(TypeCustomer typeCustomer, Locale locale) {
        return String.format(
                "Province: [id=%d,name=%s]",
                typeCustomer.getId(), typeCustomer.getName()
        );
    }

    @Override
    public TypeCustomer parse(String text, Locale locale) throws ParseException {
            return typeCustomerService.findById(Long.parseLong(text));
    }
}
