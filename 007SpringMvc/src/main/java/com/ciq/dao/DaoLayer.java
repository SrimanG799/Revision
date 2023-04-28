package com.ciq.dao;

import java.util.List;

import com.ciq.model.Employee;

public interface DaoLayer {
	void insert(Employee employee);
	void update(Employee employee);
	Employee getById(Integer id);
	List<Employee> getAllEmp();

}
