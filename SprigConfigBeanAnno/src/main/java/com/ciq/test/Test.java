package com.ciq.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ciq.configuration.ConfigurationBean;
import com.ciq.controller.ProductController;

public class Test {
	public static void main(String[] args) {
		
		ApplicationContext context =
			    new AnnotationConfigApplicationContext(ConfigurationBean.class);
		
		ProductController prc=context.getBean("proContr", ProductController.class);
	//	Product p=new Product(5, "mobil", "narzo", 18000.00);
		//prc.add(p);
		System.out.println(prc.getById(5));
		System.out.println(prc.getAll());
		
	}

}
