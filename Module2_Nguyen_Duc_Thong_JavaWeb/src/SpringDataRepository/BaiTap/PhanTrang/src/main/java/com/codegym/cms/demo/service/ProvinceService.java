package com.codegym.cms.demo.service;

import com.codegym.cms.demo.model.Province;

public interface ProvinceService {
    Iterable<Province> findAll();

    Province findById(Long id);

    void save(Province province);

    void remove(Long id);
}