package com.ciq.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ciq.model.Employee;
@Repository
@Transactional
public class DaoImpli implements DaoLayer{
	@Autowired
    private HibernateTemplate hTemplate;
	public void insert(Employee employee) {
		// TODO Auto-generated method stub
		hTemplate.save(employee);
		
	}

	public void update(Employee employee) {
		// TODO Auto-generated method stub
		hTemplate.update(employee);
		
	}

	public Employee getById(Integer id) {
		// TODO Auto-generated method stub
		return hTemplate.get(Employee.class, id);
	}

	public List<Employee> getAllEmp() {
		// TODO Auto-generated method stub
		return hTemplate.loadAll(Employee.class);
	}

}
