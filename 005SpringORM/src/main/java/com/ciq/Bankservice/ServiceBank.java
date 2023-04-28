package com.ciq.Bankservice;

import com.ciq.model.BankDTO;

public interface ServiceBank {
	void dipositMoney(String bank,String accno,double amount);
	void withDrawMoney(String bank,String accno,double amount);
	double balanceEnquery(String bank,String accno);
	void createAccount(String accn,String name,String bank,double balance,String pass);
	public 	BankDTO getDetails(String sbank,String accno);
	void moneyTransfor(String sbank,String sacno,String spass,double amount,String rbank,String raccno);
	

}
