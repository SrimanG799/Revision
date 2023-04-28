package com.ciq.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ciq.controller.ProductController;
import com.ciq.model.Product;

public class Test {
	public static void main(String[] args) {
		ApplicationContext apc=new ClassPathXmlApplicationContext("spring.xml");
		ProductController bean = apc.getBean(ProductController.class);
		
		Product product=new Product(2, "choclet", "cadbary", 45.00);
		bean.add(product);
		System.out.println("success");
		
	}

}
