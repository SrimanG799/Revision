package com.ciq.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.ciq.config.TempleteConfig;
import com.ciq.controller.ControllerJd;
import com.ciq.model.Product;


public class Controller {
	public static void main(String[] args) {
		//ApplicationContext apc=new ClassPathXmlApplicationContext("spring.xml");
		
		ApplicationContext apc=new AnnotationConfigApplicationContext(TempleteConfig.class);
		
		ControllerJd cjdb=(ControllerJd) apc.getBean("cntr");
		Product p=new Product(10, "tablet", "moto", 56000.00);
		cjdb.add(p);
		//System.out.println(cjdb.getById(5));
		//System.out.println(cjdb.getAll());
	}

}
