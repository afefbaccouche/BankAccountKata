package com.bank.kata.my_first_test;
import static org.junit.Assert.*;
import org.junit.Test;

public class AccountTest {
	
	      @Test
    	 public void shouldDepositAPositiveAmount() {
    	        // Arrange
    	        Account account = new Account();
    	        double amount = 10;
    	        // Act
    	        double balance = account.deposit(amount);
    	        // Assert
    	        assertEquals(10,balance,0.001);
	       }       
    }

