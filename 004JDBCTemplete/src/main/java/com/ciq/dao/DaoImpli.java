package com.ciq.dao;









import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import org.springframework.stereotype.Component;

import com.ciq.model.Product;
import com.ciq.rowmapper.ProductRowMapper;


public class DaoImpli implements DaoLayer {

	@Autowired
	JdbcTemplate jdbcTemp;

	public void add(Product product) {
		// TODO Auto-generated method stub
		String sqlQ="insert into product values(?,?,?,?)";
		jdbcTemp.update(sqlQ, new Object[] {product.getId(),product.getName(),product.getManufacurer(),product.getPrice()});
		System.out.println("insertrde");
	}

	public Product getById(Integer id) {
		String q="select * from product where id=?";
		
		
		return jdbcTemp.queryForObject(q,new Object[] {id}, new ProductRowMapper());
		// TODO Auto-generated method stub
		
		
	}

	public void delete(Integer id) {
		// TODO Auto-generated method stub
		String sqld="delete from product where id=?";
		jdbcTemp.update(sqld,new Object[] {id});
		
	}

	public List<Product> getAll() {
 //TODO Auto-generated method stub
	return jdbcTemp.query("select * from product", new ProductRowMapper());
		
		
	}

}
