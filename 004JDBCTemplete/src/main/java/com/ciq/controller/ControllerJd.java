package com.ciq.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ciq.model.Product;
import com.ciq.service.ProService;


public class ControllerJd {
	@Autowired
	ProService pros;
	public void add(Product product)
	{
		pros.add(product);
		
		
	}
	public Product getById(Integer id) {
		return pros.getById(id);
		
	}
	public void delete(Integer id) {
		
	}
	public List<Product> getAll()
	{
		return pros.getAll();
		
	}
	

}
