package com.ciq.model;

public class BankDTO {
	String acno;
	String name;
	String password;
	Double balance;
	public BankDTO()
	{
		
	}
	public BankDTO(String acno, String name, String password, Double balance) {
		super();
		this.acno = acno;
		this.name = name;
		this.password = password;
		this.balance = balance;
	}
	public String getAcno() {
		return acno;
	}
	public void setAcno(String acno) {
		this.acno = acno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "BankDTO [acno=" + acno + ", name=" + name + ", password=" + password + ", balance=" + balance + "]";
	}
	

}
