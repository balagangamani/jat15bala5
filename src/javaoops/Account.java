package javaoops;

import java.util.Scanner; // Import statement for Scanner

public class Account {

	private double balance; // Data member for balance

	// No-argument constructor
	public Account() {
		this.balance = 0.0; // Default balance
	}

	// Constructor that takes a single argument for balance
	public Account(double balance) {
		this.balance = balance;
	}

	// Method to deposit money into the account
	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			System.out.println("Amount deposited: " + amount);
		} else {
			System.out.println("Invalid deposit amount.");
		}
	}

	// Method to withdraw money from the account
	public void withdraw(double amount) {
		if (amount > 0 && amount <= balance) {
			balance -= amount;
			System.out.println("Amount withdrawn: " + amount);
		} else {
			System.out.println("Insufficient funds or invalid withdrawal amount.");
		}
	}

	// Method to get the current balance
	public double getBalance() {
		return balance;
	}

	// Main method to interact with the Account class using Scanner
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Account account = new Account();

		System.out.print("Enter an initial deposit: ");
		double initialDeposit = sc.nextDouble();
		account.deposit(initialDeposit);

		System.out.print("Enter an amount to deposit: ");
		double depositAmount = sc.nextDouble();
		account.deposit(depositAmount);

		System.out.print("Enter an amount to withdraw: ");
		double withdrawAmount = sc.nextDouble();
		account.withdraw(withdrawAmount);

		System.out.println("Current balance: " + account.getBalance());

	}

}
