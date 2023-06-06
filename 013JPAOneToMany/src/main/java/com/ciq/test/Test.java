package com.ciq.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.ciq.model.Consumers;
import com.ciq.model.Products;
import com.ciq.repository.CunsumerRepository;
import com.ciq.repository.ProductsRepository;
@Component
public class Test implements CommandLineRunner {
@Autowired
	CunsumerRepository cuns;
@Autowired
	ProductsRepository pro;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		List<Products> pr=new ArrayList<>();
		pr.add(new Products(111,"rice", 5, 40.00, 100.00));
		pr.add(new Products(112, "coconut", 6, 25.00, 150.00));
		Consumers c1=new Consumers(011, "sriman", pr);
		
	cuns.save(c1);


}
}
