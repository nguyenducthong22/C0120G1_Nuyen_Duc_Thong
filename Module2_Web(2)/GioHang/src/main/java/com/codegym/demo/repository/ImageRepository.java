package com.codegym.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.codegym.demo.model.Image;

public interface ImageRepository extends JpaRepository<Image, Long> {
}