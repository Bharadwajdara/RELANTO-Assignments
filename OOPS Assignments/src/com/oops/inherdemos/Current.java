package com.oops.inherdemos;

public class Current extends Account {

	public Current(double balance) {
		super(balance);
		
		
	}

	@Override
	void withdraw(double amount) {
		System.out.println(2000);
	}

	@Override
	void deposit(double amount) {
		System.out.println(5000);
	}



}
