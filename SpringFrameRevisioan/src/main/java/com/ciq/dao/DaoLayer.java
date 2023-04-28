package com.ciq.dao;

import java.util.List;

import com.ciq.model.Product;

public interface DaoLayer {
	void add(Product product);
	Product getById(Integer id);
	void delete(Integer id);
	List<Product> getAll();

}
