package com.codegym.casestudy.service.impl;

import com.codegym.casestudy.model.TypeCustomer;
import com.codegym.casestudy.repository.TypeCustomerRepository;
import com.codegym.casestudy.service.TypeCustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Transactional
@Service
public class TypeCustomerServiceImpl implements TypeCustomerService {
    @Autowired
    TypeCustomerRepository typeCustomerRepository;

    @Override
    public Page<TypeCustomer> findAll(Pageable pageable) {
        return typeCustomerRepository.findAll(pageable);
    }

    @Override
    public void save(TypeCustomer typeCustomer) {
        typeCustomerRepository.save(typeCustomer);
    }

    @Override
    public TypeCustomer findById(long id) {
        return typeCustomerRepository.findById(id).orElse(null);
    }

    @Override
    public Page<TypeCustomer> findAllByName(String s, Pageable pageable) {
        return typeCustomerRepository.findAllByNameContaining(s,pageable);
    }
}
