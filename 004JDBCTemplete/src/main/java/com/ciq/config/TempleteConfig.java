package com.ciq.config;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.jdbc.core.JdbcTemplate;

import com.ciq.controller.ControllerJd;
import com.ciq.dao.DaoImpli;
import com.ciq.dao.DaoLayer;
import com.ciq.service.ProService;
import com.ciq.service.ServiceImpli;





@Configuration
@ComponentScan(basePackages = "com.ciq")
public class TempleteConfig {
	@Bean
	public DataSource getDatS()
	{
		BasicDataSource db=new BasicDataSource();
		db.setUrl("jdbc:mysql://localhost:3306/hibernate");
		db.setUsername("root");
		db.setPassword("sql799");
		db.setDriverClassName("com.mysql.cj.jdbc.Driver");
		
		return db;
		
	}
	@Bean
	@Scope("singleton")
	public JdbcTemplate jdbcGet()
	{
		JdbcTemplate jd=new JdbcTemplate();
		jd.setDataSource(getDatS());
		return jd;
		
	}
	@Bean
	public DaoLayer getdao()
	{
		return new DaoImpli();
		
	}
	@Bean
	public ProService getService()
	{
		return new ServiceImpli();
		
	}
	@Bean(name = "cntr")
	public ControllerJd getController()
	{
		return new ControllerJd();
		
	}
	
	
	
//while we are using @Bean beans dont mention @Component on Dao,Service,Controller
}
