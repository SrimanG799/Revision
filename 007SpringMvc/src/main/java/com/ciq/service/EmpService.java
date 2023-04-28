package com.ciq.service;

import java.util.List;

import com.ciq.model.Employee;

public interface EmpService {
	void insert(Employee employee);
	void update(Employee employee);
	Employee getById(Integer id);
	List<Employee> getAllEmp();


}
