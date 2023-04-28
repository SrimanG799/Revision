package com.ciq.service;

import java.util.List;

import com.ciq.model.Product;

public interface ProService {
	void add(Product product);
	Product getById(Integer id);
	void delete(Integer id);
	List<Product> getAll();


}
