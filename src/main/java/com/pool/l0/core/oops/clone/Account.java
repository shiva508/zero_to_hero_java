package com.pool.l0.core.oops.clone;

public class Account {
	private double balance;
	private int accountId;

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public double getBalance(int accountId) { // member method
		if(this.accountId==accountId) {
			return this.balance;
		}else {
			return 0;
		}
		
	}

	public static void main(String[] args) {
		Account accnt1 = new Account(); // object creation
		accnt1.setBalance(500.00);
		accnt1.setAccountId(123456);
		double value1 = accnt1.getBalance(123456);
		System.out.println("The balance is: " + value1);
		
		Account accnt2 = new Account(); // object creation
		accnt2.setBalance(121.00);
		accnt2.setAccountId(123456121);
		double value2 = accnt2.getBalance(123456121);
		System.out.println("The balance is: " + value2);
	}
}
