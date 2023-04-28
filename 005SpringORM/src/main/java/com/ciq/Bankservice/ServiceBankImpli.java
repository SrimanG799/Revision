package com.ciq.Bankservice;

import org.springframework.beans.factory.annotation.Autowired;

import com.ciq.dao.BankDao;
import com.ciq.model.BankDTO;

public class ServiceBankImpli implements ServiceBank{
	@Autowired
	BankDao bankd;

	public void dipositMoney(String bank, String accno, double amount) {
		// TODO Auto-generated method stub
		bankd.dipositMoney(bank, accno, amount);
		
	}

	public void withDrawMoney(String bank, String accno, double amount) {
		// TODO Auto-generated method stub
		bankd.withDrawMoney(bank, accno, amount);
	}

	public double balanceEnquery(String bank, String accno) {
		// TODO Auto-generated method stub
		return bankd.balanceEnquery(bank, accno);
	}

	public void createAccount(String accn, String name, String bank, double balance, String pass) {
		// TODO Auto-generated method stub
		bankd.createAccount(accn, name, bank, balance, pass);
		
	}

	@Override
	public BankDTO getDetails(String sbank, String accno) {
		// TODO Auto-generated method stub
		return bankd.getDetails(sbank, accno);
	}

	@Override
	public void moneyTransfor(String sbank, String sacno, String spass, double amount, String rbank, String raccno) {
		// TODO Auto-generated method stub
		bankd.moneyTransfor(sbank, sacno, spass, amount, rbank, raccno);
	}

}
