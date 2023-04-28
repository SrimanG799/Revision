package com.ciq.controller;

import java.util.List;

import org.apache.log4j.Logger;

import com.ciq.model.Product;
import com.dao.service.ProService;

public class ProductController {
	
	ProService serv;
	
	public void setServ(ProService serv) {
		this.serv = serv;
	}
	
	static Logger log=Logger.getLogger(ProductController.class.getName());
	
	public void add(Product product)
	{

	
	log.info("before save");
		serv.add(product);
		log.info("after save");
		
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
		return null;
		
	}


}
