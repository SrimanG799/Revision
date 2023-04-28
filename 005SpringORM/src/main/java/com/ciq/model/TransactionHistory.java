package com.ciq.model;

public class TransactionHistory {
	String faccno;
	String fbank;
	String fname;
     String sop;
	
	 String sbank;
	 String sacno;
	 Double amount;
	 Double balance;
	 public TransactionHistory()
	 {
		 
	 }
	public TransactionHistory(String faccno, String fbank, String fname, String sop, String sbank, String sacno,
			Double amount, Double balance) {
		super();
		this.faccno = faccno;
		this.fbank = fbank;
		this.fname = fname;
		this.sop = sop;
		this.sbank = sbank;
		this.sacno = sacno;
		this.amount = amount;
		this.balance = balance;
	}
	public String getFaccno() {
		return faccno;
	}
	public void setFaccno(String faccno) {
		this.faccno = faccno;
	}
	public String getFbank() {
		return fbank;
	}
	public void setFbank(String fbank) {
		this.fbank = fbank;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getSop() {
		return sop;
	}
	public void setSop(String sop) {
		this.sop = sop;
	}
	public String getSbank() {
		return sbank;
	}
	public void setSbank(String sbank) {
		this.sbank = sbank;
	}
	public String getSacno() {
		return sacno;
	}
	public void setSacno(String sacno) {
		this.sacno = sacno;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public Double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "TransactionHistory [faccno=" + faccno + ", fbank=" + fbank + ", fname=" + fname + ", Sop=" + sop
				+ ", sbank=" + sbank + ", sacno=" + sacno + ", amount=" + amount + ", balance=" + balance + "]";
	}
	
	
	

}
