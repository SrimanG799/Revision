package com.ciq.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.ciq.model.Product;

public class ProductRowMapper implements RowMapper<Product> {

	@Override
	public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Product pro=new Product();
		pro.setId(rs.getInt(1));
		pro.setName(rs.getString(2));
		pro.setManufacurer(rs.getString(3));
		pro.setPrice(rs.getDouble(4));
		return pro;
	}

}
