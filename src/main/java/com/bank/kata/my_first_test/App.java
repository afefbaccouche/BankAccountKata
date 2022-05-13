package com.bank.kata.my_first_test;

public class App {
	public static void main(String[] args) {

		/* USER1 */
		System.out.println("USER1");
		Account user1 = new Account();

		// Deposit of 120
		user1.deposit(120);
		System.out.println("your balance: " + user1.getBalance());

		System.out.println();

		/* USER2 */

		System.out.println("USER2");
		Account user2 = new Account();

		// withdrawal of 150
		user2.withdrawal(150);
		System.out.println("your balance: " + user2.getBalance());

		System.out.println();

		/* USER3 */

		System.out.println("USER3");
		Account user3 = new Account();

		// withdrawal of 200
		user3.withdrawal(200);
		// withdrawal of 10
		user3.withdrawal(10);
		// Deposit of 300
		user3.deposit(300);
		// withdrawal of 50
		user3.withdrawal(50);
		// Deposit of 400
		user3.deposit(400);

		// statement
		user3.print();

	}

}
