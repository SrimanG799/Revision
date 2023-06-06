package com.ciq.BankController;


import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.ciq.Bankservice.ServiceBank;
import com.ciq.model.BankDTO;





public class ControllerBank {
	@Autowired
	ServiceBank serv;
	
	 private static final Logger log=Logger.getLogger(ControllerBank.class) ;
	public void dipositMoney(String bank,String accno,double amount) {
		
		 log.debug("info deposit");
		serv.dipositMoney(bank, accno, amount);
		 log.debug("info deposit2");
		
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
