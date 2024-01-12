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
		System.out.println("Preparing Black Tea with hot water, black tea leaves, and brewing for 3 minutes.");
	}
}

//Subclass for Green Tea
class GreenTea extends Tea {
	@Override
	public void prepareTea() {
		System.out.println("Preparing Green Tea with hot water, green tea leaves, and brewing for 2 minutes.");
	}
}

//Subclass for Herbal Tea
class HerbalTea extends Tea {
	@Override
	public void prepareTea() {
		System.out.println("Preparing Herbal Tea with hot water, herbal tea blend, and brewing for 5 minutes.");
	}
}

//Main class to demonstrate polymorphism with the Tea subclasses
public class TeaShop {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Choose your tea (1 - Black Tea, 2 - Green Tea, 3 - Herbal Tea): ");
		int choice = scanner.nextInt();

		Tea tea;
		switch (choice) {
		case 1:
			tea = new BlackTea();
			break;
		case 2:
			tea = new GreenTea();
			break;
		case 3:
			tea = new HerbalTea();
			break;
		default:
			System.out.println("Invalid choice, preparing basic tea.");
			tea = new Tea();
			break;
		}

		// Prepare the chosen tea
		tea.prepareTea();

		scanner.close(); // Closing the scanner object
	}
}
