package com.ciq.BankController;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ciq.config.ConfigBeans;
import com.ciq.model.BankDTO;



public class BankTest {
	public static void main(String[] args) {
		
	
	ApplicationContext context =
		    new AnnotationConfigApplicationContext(ConfigBeans.class);
	       ControllerBank cp=(ControllerBank) context.getBean("contr",ControllerBank.class);
//	    cp.createAccount("sbi007", "ram", "sbi", 10000.00, "ram");
//	    cp.createAccount("sbi008", "ramesh", "sbi", 10000.00, "ramesh");
//	    cp.createAccount("sbi009", "raja", "sbi", 10000.00, "raja");
//	    cp.createAccount("sbi010", "ravi", "sbi", 10000.00, "ravi");
//	    
//	    cp.createAccount("hdfc007", "chary", "hdfc", 10000.00, "chary");
//	    cp.createAccount("hdfc008", "raghu", "hdfc", 10000.00, "raghu");
//	    cp.createAccount("hdfc009", "bala", "hdfc", 10000.00, "bala");
	   // cp.createAccount("hdfc10", "surya", "hdfc", 10000.00, "surya");
	  // cp.createAccount("hdfc011", "prasad", "hdfc", 10000.00, "prasad");
	       
	       
      // cp.moneyTransfor("hdfc", "hdfc008", "raghu", 1000.00, "sbi", "sbi008");
//	       System.out.println(cp.balanceEnquery("sbi", "sbi003"));
//	       System.out.println(cp.balanceEnquery("hdfc", "hdfc003"));
	       
	    //  cp.moneyTransfor("sbi", "sbi010", "ravi", 1000.00, "hdfc", "hdfc008"); 
	       cp.dipositMoney("sbi", "sbi008", 5000.00);
	       
	}  
	
	
}
	
