package bankproject;

public class BankAccount {
	private String firstName; //Account holders first name
	private String lastName; //Account holders last name
	private int accountID; //Account holders ID
	private double balance; //Account holders balance
	
	// Constructor
	public BankAccount(String firstName, String lastName, int accountID) {
		//initialize fields with the provided values
		this.firstName = firstName;
		this.lastName = lastName;
		this.accountID = accountID;
		this.balance = 0.0; //set initial balance to zero
	}
	//Deposit Method (adding amount to balance)
	public void deposit(double amount) {
		this.balance += amount;
	}
	//Withdrawal Method (subtracting the amount from balance)
	public void withdrawal(double amount) {
		this.balance -= amount;
	}
	//Getters and Setters below
	public String getFirstName() {
		return firstName;
	}
	//Setting the first name
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	//Setting the last name
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public int getAccountID() {
		return accountID;
	}
	//Setting the account ID
	public void setAccountID(int accountID) {
		this.accountID = accountID;
	}
	
	public double getBalance() {
		return balance;
	}
	//Printing out the account Summary
	public void accountSummary() {
		System.out.println("Account ID: " + accountID);
		System.out.println("Account Holder: " + firstName + " " + lastName);
		System.out.println("Balance: $" + balance);
	}

}
