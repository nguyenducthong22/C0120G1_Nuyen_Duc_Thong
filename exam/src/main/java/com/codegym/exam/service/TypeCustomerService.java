package com.codegym.exam.service;

import com.codegym.exam.model.TypeCustomer;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;


public interface TypeCustomerService {
    TypeCustomer findById(long parseLong);
    List<TypeCustomer>findAll();
}
