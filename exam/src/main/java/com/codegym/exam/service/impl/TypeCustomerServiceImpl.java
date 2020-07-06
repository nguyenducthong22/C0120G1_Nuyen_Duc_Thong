package com.codegym.exam.service.impl;

import com.codegym.exam.model.TypeCustomer;
import com.codegym.exam.repository.TypeCustomerRepository;
import com.codegym.exam.service.TypeCustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service
public class TypeCustomerServiceImpl implements TypeCustomerService {

    @Autowired
    TypeCustomerRepository typeCustomerRepository;

    @Override
    public TypeCustomer findById(long id) {
        return typeCustomerRepository.findById(id).orElse(null);
    }

    @Override
    public List<TypeCustomer> findAll() {
        return (List<TypeCustomer>) typeCustomerRepository.findAll();
    }


}
