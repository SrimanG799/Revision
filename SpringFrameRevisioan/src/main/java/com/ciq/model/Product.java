package com.ciq.model;

public class Product {
	Integer id;
	String name;
	String manufacurer;
	Double price;
	public Product()
	{
		
	}
	public Product(Integer id, String name, String manufacurer, Double price) {
		super();
		this.id = id;
		this.name = name;
		this.manufacurer = manufacurer;
		this.price = price;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getManufacurer() {
		return manufacurer;
	}
	public void setManufacurer(String manufacurer) {
		this.manufacurer = manufacurer;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", manufacurer=" + manufacurer + ", price=" + price + "]";
	}
	

}
