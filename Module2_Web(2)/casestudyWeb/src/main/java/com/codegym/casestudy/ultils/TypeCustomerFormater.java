package com.codegym.casestudy.ultils;

import com.codegym.casestudy.model.TypeCustomer;
import com.codegym.casestudy.service.TypeCustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;

import java.text.ParseException;
import java.util.Locale;

public class TypeCustomerFormater implements Formatter<TypeCustomer> {
    private TypeCustomerService typeCustomerService;
    @Autowired
    public TypeCustomerFormater(TypeCustomerService typeCustomerService){
        this.typeCustomerService=typeCustomerService;
    }

    @Override
    public TypeCustomer parse(String s, Locale locale) throws ParseException {
        return typeCustomerService.findById(Long.parseLong(s));
    }

    @Override
    public String print(TypeCustomer typeCustomer, Locale locale) {
        return null;
    }
}
