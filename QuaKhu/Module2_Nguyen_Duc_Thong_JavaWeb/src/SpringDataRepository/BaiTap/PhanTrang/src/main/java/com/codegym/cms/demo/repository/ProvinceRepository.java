package com.codegym.cms.demo.repository;

import com.codegym.cms.demo.model.Province;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ProvinceRepository extends PagingAndSortingRepository<Province, Long> {
    Province findOne(Long id);

    void delete(Long id);
}