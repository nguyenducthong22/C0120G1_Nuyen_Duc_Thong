package com.codegym.demo2.service.impl;

import com.codegym.demo2.model.Customer;
import com.codegym.demo2.model.TypeCustomer;
import com.codegym.demo2.repository.TypeCustomerRepository;
import com.codegym.demo2.service.TypeCustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Transactional
@Service
public class TypeCustomerServiceImpl implements TypeCustomerService {

    @Autowired
    TypeCustomerRepository typeCustomerRepository;
    @Override
    public Iterable<TypeCustomer> findAll() {
        return typeCustomerRepository.findAll();
    }

    @Override
    public TypeCustomer findById(long id) {
        return typeCustomerRepository.findById(id).orElse(null);
    }

    @Override
    public void save(TypeCustomer typeCustomer) {
        typeCustomerRepository.save(typeCustomer);
    }

    @Override
    public void remove(long id) {
        typeCustomerRepository.deleteById(id);
    }
}
