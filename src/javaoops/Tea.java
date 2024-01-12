package javaoops;

import java.util.Scanner;

import day10.Tea;

public class Tea {

	private boolean hasMilk;
	private boolean hasSugar;

	// Constructor for Tea class
	public Tea() {
		this.hasMilk = false;
		this.hasSugar = false;
	}

	// Method to prepare basic tea
	public void prepareTea() {
		System.out.println("Preparing a basic tea with hot water and tea leaves.");
	}

	// Method to add milk to the tea
	public void addMilk() {
		hasMilk = true;
		System.out.println("Milk added to the tea.");
	}

	// Method to add sugar to the tea
	public void addSugar() {
		hasSugar = true;
		System.out.println("Sugar added to the tea.");
	}

	// Main method to interact with the Tea class using Scanner
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Tea myTea = new Tea();
		myTea.prepareTea();

		System.out.print("Would you like to add milk to the tea? (yes/no): ");
		String milkResponse = sc.next();
		if ("yes".equalsIgnoreCase(milkResponse)) {
			myTea.addMilk();
		}

		System.out.print("Would you like to add sugar to the tea? (yes/no): ");
		String sugarResponse = sc.next();
		if ("yes".equalsIgnoreCase(sugarResponse)) {
			myTea.addSugar();
		}

		System.out.println("Your tea is ready!");
		if (myTea.hasMilk) {
			System.out.println("Milk was added.");
		}
		if (myTea.hasSugar) {
			System.out.println("Sugar was added.");
		}

	}

}
