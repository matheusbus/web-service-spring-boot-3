package com.matheusbus.Estudos.Spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matheusbus.Estudos.Spring.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
