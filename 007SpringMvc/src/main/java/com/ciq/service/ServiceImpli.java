package com.ciq.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ciq.dao.DaoLayer;
import com.ciq.model.Employee;
@Service
@Transactional
public class ServiceImpli implements EmpService{
	@Autowired
DaoLayer dao;
	public void insert(Employee employee) {
		// TODO Auto-generated method stub
		dao.insert(employee);
		
	}

	public void update(Employee employee) {
		// TODO Auto-generated method stub
		dao.update(employee);
		
	}

	public Employee getById(Integer id) {
		// TODO Auto-generated method stub
		return dao.getById(id);
	}

	public List<Employee> getAllEmp() {
		// TODO Auto-generated method stub
		return dao.getAllEmp();
	}

}
