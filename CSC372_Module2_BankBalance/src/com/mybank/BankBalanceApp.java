package com.mybank;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class BankBalanceApp extends JFrame{
	private BankAccount account; //Pulling from the BankAccount.java code in the previous part
	private JTextField amountField; //This is the text field for entering the amount to be deposited or withdrawn 
	private JButton depositButton; //Button for depositing funds
	private JButton withdrawButton; //Button for withdrawing funds
	private JButton checkBalanceButton; //Button for checking the balance
	private JLabel balanceLabel; //Label to display the account balance
	
	public BankBalanceApp() {
		//Initializing the bank account with a starting balance of zero
		account = new BankAccount(0.00);
		
		//Creating the GUI components used in the below areas
		amountField = new JTextField(10);//Size of the text field used when entering number for the deposit/withdraw actions
		depositButton = new JButton("Deposit"); 
		withdrawButton = new JButton("Withdraw");
		checkBalanceButton = new JButton("Check Balance");
		balanceLabel = new JLabel();
		
		//The panel used to hold the above GUI components
		JPanel panel = new JPanel();
		panel.add(amountField);
		panel.add(depositButton);
		panel.add(withdrawButton);
		panel.add(checkBalanceButton);
		panel.add(balanceLabel);
		
		//The three sections below are the Action Listeners to respond the buttons
		depositButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double amount = Double.parseDouble(amountField.getText());
				account.deposit(amount);
				
				balanceLabel.setText("Balance: $" + account.getBalance());
				
			}
			
		});
		
		withdrawButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double amount = Double.parseDouble(amountField.getText());
				account.withdraw(amount);
				balanceLabel.setText("Balance: $" + account.getBalance());
			}
		});
		
		checkBalanceButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				balanceLabel.setText("Balance: $" + account.getBalance());
			}
		});
		
		//Adding the panel to the frame
		this.add(panel);
		//Setting the frame properties
		this.setTitle("Bank Balance Manager"); //Title of the frame
		this.setSize(350, 125); //Size
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Close operation
		this.setVisible(true); //Allowing the frame to be visible to the user
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new BankBalanceApp();
			}
		});
	}
	
}
