package com.ciq.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ciq.model.Product;
import com.ciq.service.ProService;


public class ProductController {
	@Autowired
	ProService serv;
	
	public void add(Product product)
	{
     serv.add(product);
	
	
	}
	public Product getById(Integer id)
	{
		return serv.getById(id);
		
	}
	public void delete(Integer id)
	{
		
	}
public 	List<Product> getAll()
	{
		return serv.getAll();
		
	}


}
