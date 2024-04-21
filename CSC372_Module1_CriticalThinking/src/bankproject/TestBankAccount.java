package bankproject;

public class TestBankAccount {

	public static void main(String[] args) {
		CheckingAccount myAccount = new CheckingAccount("Misty", "Ryan", 56789, 2);
		myAccount.deposit(600);
		myAccount.displayAccount();
		
		myAccount.processWithdrawal(625);
		myAccount.displayAccount();

	}

}
