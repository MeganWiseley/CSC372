package bankproject;

public class BankAccount {
	private String firstName;
	private String lastName;
	private int accountID;
	private double balance;
	
	public BankAccount(String firstName, String lastName, int accountID) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.accountID = accountID;
		this.balance = 0.0;
	}
	
	public void deposit(double amount) {
		this.balance += amount;
	}
	
	public void withdrawal(double amount) {
		this.balance -= amount;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public int getAccountID() {
		return accountID;
	}
	
	public void setAccountID(int accountID) {
		this.accountID = accountID;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void accountSummary() {
		System.out.println("Account ID: " + accountID);
		System.out.println("Account Holder: " + firstName + " " + lastName);
		System.out.println("Balance: $" + balance);
	}

}
