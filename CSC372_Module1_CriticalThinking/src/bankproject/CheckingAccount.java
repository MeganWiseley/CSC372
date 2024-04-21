package bankproject;

public class CheckingAccount extends BankAccount { // CheckingAccount inherits the BankAccount
	private double interestRate; //Interest rate for the checking account
	
	public CheckingAccount(String firstName, String lastName, int accountID, double interestRate) {
		super(firstName, lastName, accountID); // calling the constructor of the superclass 
		this.interestRate = interestRate; // initialize the interest rate
	}
	// Method to process Withdrawals including an overdraft fee
	public void processWithdrawal(double amount) {
		if (getBalance() - amount < 0) {
			super.withdrawal(amount + 30.0);
			System.out.println("Overdraft, $30 fee charged to account.");
		} else {
			super.withdrawal(amount);
		}
	}
	// Method to display the Account Summary
	public void displayAccount() {
		super.accountSummary();
		System.out.println("Interest rate: " + interestRate + "%");
	}
	// Getter method for retrieving the interest rate
	public double getInterestRate() {
		return interestRate;
	}
	// Setter method for updating the interest rate
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

}
