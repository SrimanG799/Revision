package com.ciq.controller;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;


import com.ciq.model.Product;
import com.ciq.service.ProService;


public class ControllerJd {
	
	private static Logger log=Logger.getLogger( ControllerJd.class.getName());
	@Autowired
	ProService pros;
	public void add(Product product)
	{
		log.warning("warn");
		log.info("LoggerInfo");
		
		pros.add(product);
		log.info("loggerInfo");
		
		
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
