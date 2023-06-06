package com.ciq.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ciq.model.Products;

public interface ProductsRepository extends JpaRepository<Products, Integer> {

}
