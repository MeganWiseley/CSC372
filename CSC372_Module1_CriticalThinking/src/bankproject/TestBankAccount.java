package bankproject;

public class TestBankAccount { // Main method to test the CheckingAccount class
	//Creating a new CheckingAccount object
	public static void main(String[] args) {
		CheckingAccount myAccount = new CheckingAccount("Misty", "Ryan", 56789, 2);
		myAccount.deposit(600);
		myAccount.displayAccount();
		
		myAccount.processWithdrawal(625);
		myAccount.displayAccount();
		//The above describes the deposit and withdrawal with an overdraft
	}

}
