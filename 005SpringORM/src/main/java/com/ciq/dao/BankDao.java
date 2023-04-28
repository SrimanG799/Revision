package com.ciq.dao;

import java.util.List;

import com.ciq.model.BankDTO;
import com.ciq.model.TransactionHistory;

public interface BankDao {
	void dipositMoney(String bank,String accno,double amount);
	
	void withDrawMoney(String bank,String accno,double amount);
	
	double balanceEnquery(String bank,String accno);
	
	void createAccount(String accn,String name,String bank,double balance,String pass);
	
	void moneyTransfor(String sbank,String sacno,String spass,double amount,String rbank,String raccno);
	
	
     public BankDTO getDetails(String sbank,String accno);
     
    List<TransactionHistory> getHistory(String accno);

}
