package com.codegym.customer.service.impl;

import com.codegym.customer.Model.Customer;
import com.codegym.customer.Model.TypeCustomer;
import com.codegym.customer.repository.TypeCustomerRepository;
import com.codegym.customer.service.TypeCustomerService;
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
    public Page<TypeCustomer> findAll(Pageable pageable) {
        return typeCustomerRepository.findAll(pageable);
    }

    @Override
    public TypeCustomer findById(long id) {
        return typeCustomerRepository.findById(id).orElse(null);
    }

    @Override
    public void remove(long id) {
        typeCustomerRepository.deleteById(id);
    }

    @Override
    public void save(TypeCustomer typeCustomer) {
        typeCustomerRepository.save(typeCustomer);
    }

    @Override
    public Page<TypeCustomer> findAllByName(String name, Pageable pageable) {
        return typeCustomerRepository.findAllByNameContaining(name,pageable);
    }

    @Override
    public List<TypeCustomer> findAll() {
        return (List<TypeCustomer>) typeCustomerRepository.findAll();
    }
}
