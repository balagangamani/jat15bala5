package javaoops;

import java.util.Scanner;

public class Person {

	// Attributes
	private String name;
	private int age;

	// Constructor
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// Getter for name
	public String getName() {
		return name;
	}

	// Getter for age
	public int getAge() {
		return age;
	}

	// Method to read input from user

	public static void createPersonFromInput() {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter name: ");
		String name = sc.nextLine();

		System.out.print("Enter age: ");
		int age = sc.nextInt(); // This can throw InputMismatchException if the input is not an integer

		Person person = new Person(name, age);

		// Display the information
		System.out.println("Person created: " + person.getName() + ", " + person.getAge() + " years old");

	}

	public static void main(String[] args) {
		createPersonFromInput();
	}

}
