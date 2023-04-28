package com.ciq.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import javax.sql.DataSource;

import com.ciq.model.Product;

public class DaoImpli implements DaoLayer {
// DataSource is dependency class and data its instance we have to inject datasourse bean in DAo(daol) 
	//from spring.xml
	DataSource data;
	

	public void setData(DataSource datasource) {
		data= datasource;
	}

	public void add(Product product) {
		// TODO Auto-generated method stub
		
		Connection con=null;
		PreparedStatement pst=null;
		try {
			
			con=data.getConnection();
			pst=con.prepareStatement("insert into product values(?,?,?,?)");
			pst.setInt(1, product.getId());
			pst.setString(2, product.getName());
			pst.setString(3, product.getManufacurer());
			pst.setDouble(4, product.getPrice());
			pst.executeUpdate();
			
			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		
	}

	public Product getById(Integer id) {
		Connection con=null;
		PreparedStatement pst=null;
		ResultSet rst=null;
		Product pro=new Product();
		try {
			con=data.getConnection();
			pst=con.prepareStatement("select * from product where id=?");
			pst.setInt(1, id);
			rst=pst.executeQuery();
			while(rst.next())
			{
				pro.setId(rst.getInt(1));
				pro.setName(rst.getString(2));
				pro.setManufacurer(rst.getString(3));
				pro.setPrice(rst.getDouble(4));
				
			}
			
			
			
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
				
		
		
		// TODO Auto-generated method stub
		return pro;
	}

	public void delete(Integer id) {
		// TODO Auto-generated method stub
		
	}

	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
