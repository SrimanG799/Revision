package com.ciq.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.transaction.annotation.EnableTransactionManagement;

@Table
@Entity
@EnableTransactionManagement
public class Employee {
	@Id
	Integer eid;
	String name;
	Integer age;
	String sector;
	String organization;
	String designation;
	Double experiance;
	Double salary;
public Employee()
{
	
}


public Employee(Integer eid, String name, Integer age, String sector, String organization, String designation,
		Double experiance, Double salary) {
	super();
	this.eid = eid;
	this.name = name;
	this.age = age;
	this.sector = sector;
	this.organization = organization;
	this.designation = designation;
	this.experiance = experiance;
	this.salary = salary;
}


public Integer getEid() {
	return eid;
}


public void setEid(Integer eid) {
	this.eid = eid;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public Integer getAge() {
	return age;
}


public void setAge(Integer age) {
	this.age = age;
}


public String getSector() {
	return sector;
}


public void setSector(String sector) {
	this.sector = sector;
}


public String getOrganization() {
	return organization;
}


public void setOrganization(String organization) {
	this.organization = organization;
}


public String getDesignation() {
	return designation;
}


public void setDesignation(String designation) {
	this.designation = designation;
}


public Double getExperiance() {
	return experiance;
}


public void setExperiance(Double experiance) {
	this.experiance = experiance;
}


public Double getSalary() {
	return salary;
}


public void setSalary(Double salary) {
	this.salary = salary;
}


@Override
public String toString() {
	return "Employee [eid=" + eid + ", name=" + name + ", age=" + age + ", sector=" + sector + ", organization="
			+ organization + ", designation=" + designation + ", experiance=" + experiance + ", salary=" + salary + "]";
}

}
