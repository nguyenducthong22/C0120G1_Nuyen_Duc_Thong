package com.codegym.cms.demo.repository;

import com.codegym.cms.demo.model.Customer;
import com.codegym.cms.demo.model.Province;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CustomerRepository extends PagingAndSortingRepository<Customer, Long> {
    Iterable<Customer> findAllByProvince(Province province);

    Page<Customer> findAllByFirstNameContaining(String firstname, Pageable pageable);

    void delete(Long id);

    Customer findOne(Long id);
}