package bankproject;

public class CheckingAccount extends BankAccount {
	private double interestRate;
	
	public CheckingAccount(String firstName, String lastName, int accountID, double interestRate) {
		super(firstName, lastName, accountID);
		this.interestRate = interestRate;
	}
	
	public void processWithdrawal(double amount) {
		if (getBalance() - amount < 0) {
			super.withdrawal(amount + 30.0);
			System.out.println("Overdraft, $30 fee charged to account.");
		} else {
			super.withdrawal(amount);
		}
	}
	
	public void displayAccount() {
		super.accountSummary();
		System.out.println("Interest rate: " + interestRate + "%");
	}
	
	public double getInterestRate() {
		return interestRate;
	}
	
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

}
