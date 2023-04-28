package com.ciq.configuration;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.ciq.controller.ProductController;
import com.ciq.dao.DaoImpli;
import com.ciq.dao.DaoLayer;
import com.ciq.service.ProService;
import com.ciq.service.ServiceImpli;

@Configuration
@ComponentScan(basePackages = "com.ciq")
public class ConfigurationBean {
	
	//@Bean is equal to <bean id="beanName" class="FullYQulifiedClass"></bean>
	@Bean
	public DaoLayer dao()
	{
		return new DaoImpli();
		
	}
	@Bean
	public ProService servi()
	{
		return new ServiceImpli();
		
	}
	//<bean id=""proConr" class="com.ciq.Productcontroller">
	@Bean(name = "proContr")
	
	public ProductController prog()
	{
		return new ProductController();
		
	}
	@Bean
	public DataSource getData()
	{
		BasicDataSource db=new BasicDataSource();
		
		db.setUrl("jdbc:mysql://localhost:3306/hibernate");
		db.setUsername("root");
		db.setPassword("sql799");
		db.setDriverClassName("com.mysql.cj.jdbc.Driver");
		
		return db;
				
		
	}

}
