package com.codygym.demo.Service;

import com.codygym.demo.entity.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CustomerService {
    Page<Customer> findAll(Pageable pageable);

    Page<Customer> findByFullNameContaining(String fullName, Pageable pageable);

    Customer findById(Long id);

    void save(Customer customer);

    void remove(Long id);

}
