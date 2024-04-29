package com.mybank;

// The below represents the initial start of the bank account, of initial balance, deposit, withdraw, and balance after action
public class BankAccount { 
	private double balance; //This stores the initial balance
	
	public BankAccount(double initialBalance) { 
		balance = initialBalance; //Initializes the initial balance from above
	}
	
	public void deposit(double amount) {
		balance += amount; //Increases the initial amount 
	}
	
	public void withdraw(double amount) {
		balance -= amount; //Decreases the initial amount 
	}
	
	public double getBalance() {
		return balance; //Gives the balance either before or after any action is taken
	}

}
