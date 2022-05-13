package com.bank.kata.my_first_test;

public class Account {

// 	account balance
	private double balance;

// 	account statement
	private Statement statement;

// 	minimum balance
	private double minBalance;

// maximum balance
	private double maxBalance;

	public Account() {
		statement = new Statement();
		balance = 0;

//  defining maximum and minimum balance

		this.maxBalance = 5000;
		this.minBalance = -200;
	}

	public Account(double balance, double minBalance, double maxBalance) {
		this();
		this.balance = balance;
		this.maxBalance = maxBalance;
		this.minBalance = minBalance;
	}

// for withdrawal

	public void withdrawal(double amount) {

		// check if withdrawal is possible
		if ((balance - amount) >= minBalance) {
			Operation operation = new Operation("WITHDRAWAL", amount);
			statement.addOperation(operation);
			balance -= amount;
			System.out.println("withdrawal is successfully done");
		} else {
			System.out.println("impossible to do withdrawal");
		}
	}

//	 for deposit

	public double deposit(double amount) {

//	check if deposit is possible 

		if ((balance + amount) <= maxBalance) {
			Operation operation = new Operation("DEPOSIT   ", amount);
			statement.addOperation(operation);
			balance += amount;
			System.out.println("deposit is successfully done");
		} else {

			System.out.println("impossible to deposit");
		}
		return balance;
	}

// 	Statement printing

	public void print() {
		System.out.println("History of my operations: ");
		System.out.println("-------=======---------");
		System.out.println("OPERATION    AMOUNT    DATE ");
		System.out.println("----------------------------");
		System.out.println(statement.print());
		System.out.println("BALANCE:   " + balance);
		System.out.println("Have a great day");
	}

	//return balance
	public double getBalance() {
		return balance;
	}

}
