package com.ciq.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ciq.model.BankDTO;
import com.ciq.model.TransactionHistory;



public class BankImpli implements BankDao {
	@Autowired
	DataSource data;

	public void dipositMoney(String bank, String accno, double amount) {
		// TODO Auto-generated method stub
		

		try {
			Connection con = data.getConnection();

			Double temp = balanceEnquery(bank, accno);

			temp = temp + amount;
			PreparedStatement pst = null;
			if (bank == "sbi") {
				pst = con.prepareStatement("update sbi set balance=? where acno=?");
			} else if (bank == "hdfc") {
				pst = con.prepareStatement("update hdfc set balance=? where acno=?");
			}

			pst.setDouble(1, temp);
			pst.setString(2, accno);
			pst.executeUpdate();
			System.out.println("succesfully diposited");
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	
	}

	public void withDrawMoney(String bank, String accno, double amount) {
		try {
			Connection con = data.getConnection();

			Double temp = balanceEnquery(bank, accno);

			System.out.println("aval  " + temp);

			temp = temp - amount;

			PreparedStatement pst = null;
			if (bank == "sbi") {
				pst = con.prepareStatement("update sbi set balance=? where acno=?");
			} else if (bank == "hdfc") {
				pst = con.prepareStatement("update hdfc set balance=? where acno=?");
			}

			pst.setDouble(1, temp);
			pst.setString(2, accno);
			pst.executeUpdate();
			System.out.println("succesfully withdrw");

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		// TODO Auto-generated method stub

	}

	public double balanceEnquery(String bank, String accno) {
		// TODO Auto-generated method stub
		Double bal = 0.0;
		try {
			Connection con = data.getConnection();
			BankDTO b = new BankDTO();
			String Query = null;
			if (bank == "sbi") {

				Query = "select * from sbi where acno=?";
			} else if (bank == "hdfc") {
				Query = "select * from hdfc where acno=?";

			}

			PreparedStatement pst = con.prepareStatement(Query);
			pst.setString(1, accno);
			ResultSet rs = pst.executeQuery();

			while (rs.next()) {
				b.setBalance(rs.getDouble(2));
			}

			bal = b.getBalance();

		} catch (Exception e) {
			e.printStackTrace();
		}
		// TODO: handle exception
		System.out.println(bal);
		return bal;
	}

	public void createAccount(String accn, String name, String bank, double balance, String pass) {
		// TODO Auto-generated method stub
		try {
			Connection con = data.getConnection();
			PreparedStatement pst = null;
			if (bank == "sbi") {
				pst = con.prepareStatement("insert into sbi values(?,?,?,?)");
			} else if (bank == "hdfc") {
				pst = con.prepareStatement("insert into hdfc values(?,?,?,?)");

			}

			pst.setString(1, accn);
			pst.setDouble(2, balance);
			pst.setString(3, name);
			pst.setString(4, pass);

			int s = pst.executeUpdate();
			if (s == 1) {
				System.out.println("success");
			} else {
				System.out.println("fail");
			}

			Statement creat = con.createStatement();
			creat.execute("create table " + accn
					+ "(accno varchar(25),name varchar(25),activity varchar(25),outaccn varchar(25),outname varchar(20),amount decimal(10,5),balance decimal(10.5))");
			System.out.println("table created with girvn " + accn);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void checkConnection() {
		try {
			Connection con = data.getConnection();
			System.out.println(con.hashCode());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void moneyTransfor(String sbank, String sacno, String spass, double amount, String rbank, String raccno) {
		Connection con = null;

		try {
			con = data.getConnection();

			con.setAutoCommit(false);

			BankDTO sender = getDetails(sbank, sacno);
			BankDTO receiver = getDetails(rbank, raccno);

			System.out.println(sender.toString());

			if (sender.getPassword().equals(spass)) {
				System.out.println("pasword check");

				if (sender.getBalance() >= amount) {
					System.out.println("balance check");
					withDrawMoney(sbank, sacno, amount);
					dipositMoney(rbank, raccno, amount);
					// sender table
					PreparedStatement pst2 = con
							.prepareStatement("insert into " + sender.getAcno() + " values(?,?,?,?,?,?,?)");
					pst2.setString(1, sender.getAcno());
					pst2.setString(2, sender.getName());
					pst2.setString(3, "moneySent");
					pst2.setString(4, receiver.getAcno());
					pst2.setString(5, receiver.getName());
					pst2.setDouble(6, amount);
					pst2.setDouble(7, sender.getBalance() - amount);
					pst2.executeUpdate();
					System.out.println("sender history updated");

					// Receiver table

					PreparedStatement pst3 = con
							.prepareStatement("insert into " + receiver.getAcno() + " values(?,?,?,?,?,?,?)");
					pst3.setString(1, receiver.getAcno());
					pst3.setString(2, receiver.getName());
					pst3.setString(3, "recived");
					pst3.setString(4, sender.getAcno());
					pst3.setString(5, sender.getName());
					pst3.setDouble(6, amount);
					pst3.setDouble(7, receiver.getBalance() + amount);
					pst3.executeUpdate();
					System.out.println("reciver history updated");
					con.setAutoCommit(true);

				} else {
					System.out.println("insaficient balance");
				}

			} else {
				System.out.println("password problem");
			}
			// Transaction mangement history

			/// sender history table

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			try {
				con.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

		}

	}

	@Override
	public BankDTO getDetails(String sbank, String accno) {
		// TODO Auto-generated method stub
		BankDTO b = new BankDTO();
		try {
			Connection con = data.getConnection();

			String Query = null;
			if (sbank == "sbi") {

				Query = "select * from sbi where acno=?";
			} else if (sbank == "hdfc") {
				Query = "select * from hdfc where acno=?";

			}

			PreparedStatement pst = con.prepareStatement(Query);
			pst.setString(1, accno);
			ResultSet rs = pst.executeQuery();

			while (rs.next()) {
				b.setAcno(rs.getString(1));
				b.setBalance(rs.getDouble(2));
				b.setName(rs.getString(3));
				b.setPassword(rs.getString(4));
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();

		}
		return b;
	}

	@Override
	public List<TransactionHistory> getHistory(String accno) {
		
		try {
			Connection con=data.getConnection();
			
			PreparedStatement pst=con.prepareStatement("select * from "+accno+" where acno=?");
			ResultSet rs=pst.executeQuery();
			List<TransactionHistory> tr=new ArrayList();
			while(rs.next())
			{
				TransactionHistory th=new TransactionHistory();
			
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return null;
	}
}
