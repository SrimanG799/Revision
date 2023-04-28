package com.ciq.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ciq.dao.DaoLayer;
import com.ciq.model.Product;

public class ServiceImpli implements ProService {
	@Autowired
	DaoLayer dao;

	

	

	public void add(Product product) {
		// TODO Auto-generated method stub
		dao.add(product);
		
	}

	public Product getById(Integer id) {
		// TODO Auto-generated method stub
		return dao.getById(id);
	}

	public void delete(Integer id) {
		// TODO Auto-generated method stub
		
	}

	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return dao.getAll();
	}

}
