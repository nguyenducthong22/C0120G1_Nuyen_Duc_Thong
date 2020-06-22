package com.codegym.demo2.service.impl;

import com.codegym.demo2.model.Customer;
import com.codegym.demo2.model.TypeCustomer;
import com.codegym.demo2.repository.TypeCustomerRepository;
import com.codegym.demo2.service.TypeCustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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
    public void save(TypeCustomer typeCustomer) {
        typeCustomerRepository.save(typeCustomer);
    }

    @Override
    public void remove(long id) {
        typeCustomerRepository.deleteById(id);
    }

    @Override
    public Page<TypeCustomer> findAllByName(String name, Pageable pageable) {
        return typeCustomerRepository.findAllByNameContaining(name, pageable);
    }

    @Override
    public Page<TypeCustomer> findAllOderByName(Pageable pageable) {
        return typeCustomerRepository.findByOrderByName(pageable);
    }

    @Override
    public Page<TypeCustomer> findAll(Pageable pageable) {
        return typeCustomerRepository.findAll(pageable);
    }
}
