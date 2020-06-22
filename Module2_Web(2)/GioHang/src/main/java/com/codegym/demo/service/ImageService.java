package com.codegym.demo.service;

import com.codegym.demo.model.Image;

import java.util.List;

public interface ImageService {
    List<Image> findAll();

    Image findById(Long id);

    void save(Image image);

    void remove(Long id);
}