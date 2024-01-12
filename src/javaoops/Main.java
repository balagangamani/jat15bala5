package javaoops;

import java.util.Scanner;

//Base Tea class
class Tea {
	// Method to prepare tea
	public void prepareTea() {
		System.out.println("Preparing a basic tea.");
	}
}

//Subclass for Black Tea
class BlackTea extends Tea {
	@Override
	public void prepareTea() {
		System.out.println("Preparing Black Tea with hot water and black tea leaves, brewing for 3 minutes.");
	}
}

//Subclass for Green Tea
class GreenTea extends Tea {
	@Override
	public void prepareTea() {
		System.out.println("Preparing Green Tea with hot water and green tea leaves, brewing for 2 minutes.");
	}
}

//Subclass for Herbal Tea
class HerbalTea extends Tea {
	@Override
	public void prepareTea() {
		System.out.println("Preparing Herbal Tea with hot water and herbal tea blend, brewing for 5 minutes.");
	}
}

//Main class to demonstrate polymorphism with the Tea subclasses
class Main {
	public static void main(String[] args) {
		Tea[] teas = new Tea[3]; // Array to hold Tea objects
		teas[0] = new BlackTea(); // Polymorphic assignment
		teas[1] = new GreenTea(); // Polymorphic assignment
		teas[2] = new HerbalTea(); // Polymorphic assignment

		Scanner scanner = new Scanner(System.in);
		System.out.println("Which tea would you like to prepare?");
		System.out.println("1. Black Tea");
		System.out.println("2. Green Tea");
		System.out.println("3. Herbal Tea");
		System.out.print("Enter your choice (1-3): ");

		int choice = scanner.nextInt() - 1; // Subtract 1 for zero-based index
		if (choice >= 0 && choice < teas.length) {
			teas[choice].prepareTea();
		} else {
			System.out.println("Invalid choice. Preparing a basic tea.");
			new Tea().prepareTea();
		}

		scanner.close(); // Closing the scanner object
	}
}