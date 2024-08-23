package com.kirangs.java8;

public class Account {

	private String owner;
	private double balance;

	public Account(String owner, double balance) {
		this.owner = owner;
		this.balance = balance;
	}

	public String getOwner() {
		return owner;
	}

	public double getBalance() {
		return balance;
	}

	public void withdraw(double amount) {

		if (amount <= this.balance) {
			System.out.println("Withdrawn successfully");
			this.balance = this.balance - amount;
		} else {
			System.out.println("Insufficient Balance");
		}
	}

}
