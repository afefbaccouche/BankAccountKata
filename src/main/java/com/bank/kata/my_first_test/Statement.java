package com.bank.kata.my_first_test;

import java.util.ArrayList;

public class Statement {
	private ArrayList<Operation> operations;

	public Statement() {
		operations = new ArrayList<Operation>();
	}

	// add Operation
	public void addOperation(Operation newOperation) {
		operations.add(newOperation);
	}

	// Printing

	public String print() {

		String statement = new String();

		for (int i = 0; i < operations.size(); i++) {
			statement += operations.get(i).print();
			statement += "\n";
		}
		return statement;
	}

}
