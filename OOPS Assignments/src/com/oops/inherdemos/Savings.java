package com.oops.inherdemos;

public class Savings extends Account {

	public Savings(double balance) {
		super(balance);
		
	}

	@Override
	void withdraw(double amount) {
		System.out.println(6000);
		super.withdraw(amount);
	}

	@Override
	void deposit(double amount) {
		System.out.println(8000);
	}
	

}
