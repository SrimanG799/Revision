package com.ciq.BankController;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.ciq.Bankservice.ServiceBank;
import com.ciq.model.BankDTO;

import ch.qos.logback.classic.Logger;



public class ControllerBank {
	@Autowired
	ServiceBank serv;
	
	  
	public void dipositMoney(String bank,String accno,double amount) {
		  Logger loger=(Logger) LoggerFactory.getLogger(ControllerBank.class);

		loger.info("dopisit begin");
		loger.atDebug();
		serv.dipositMoney(bank, accno, amount);
		loger.info("deposit end");
		
	}
	public void withDrawMoney(String bank,String accno,double amount) {
		serv.withDrawMoney(bank, accno, amount);
		
	}
     public 	double balanceEnquery(String bank,String accno) {
    	 
		return serv.balanceEnquery(bank, accno);
		
	}

	public void createAccount(String accn,String name,String bank,double balance,String pass) {
		
		serv.createAccount(accn, name, bank, balance, pass);
	}
	public 	BankDTO getDetails(String sbank,String accno) {
		return serv.getDetails(sbank, accno);
	}
	void moneyTransfor(String sbank,String sacno,String spass,double amount,String rbank,String raccno) {
		serv.moneyTransfor(sbank, sacno, spass, amount, rbank, raccno);
	}
	
}
