package com.ciq.config;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.ciq.BankController.ControllerBank;
import com.ciq.Bankservice.ServiceBank;
import com.ciq.Bankservice.ServiceBankImpli;
import com.ciq.dao.BankDao;
import com.ciq.dao.BankImpli;

@Configuration
@ComponentScan(basePackages = "com.ciq")
public class ConfigBeans {
	
	@Bean
	public DataSource getdata()
	{
		BasicDataSource db=new BasicDataSource();
		db.setUrl("jdbc:mysql://localhost:3306/springframework");
		db.setUsername("root");
		db.setPassword("sql799");
		db.setDriverClassName("com.mysql.cj.jdbc.Driver");
		return db;
		
		
	}
	@Bean
	public BankDao getdao()
	{
		return new BankImpli();
		
	}
	@Bean
	public ServiceBank geyserv()
	{
		return new ServiceBankImpli();
		
	}
	@Bean(name = "contr")
	public ControllerBank getcot()
	{
		return new ControllerBank();
		
	}

}
