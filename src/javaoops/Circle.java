package javaoops;

import java.util.Scanner;

public class Circle {

	private double radius;

	// No-argument constructor
	public Circle() {
		this.radius = 1.0; // default radius
	}

	// Constructor that takes a single argument for the radius
	public Circle(double radius) {
		this.radius = radius;
	}

	// Method to calculate the circumference
	public double calculateCircumference() {
		return 2 * Math.PI * radius;
	}

	// Method to set the radius using Scanner for input
	public void inputRadius() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the radius of the circle: ");
		this.radius = sc.nextDouble();
		// It's generally not a good idea to close the scanner here if you're using
		// System.in
		// as it will also close System.in. Only close the scanner when you're done with
		// all input operations
		// scanner.close();
	}

	// Main method to test the Circle class
	public static void main(String[] args) {
		Circle circle = new Circle();
		circle.inputRadius();
		double circumference = circle.calculateCircumference();
		System.out.println("The circumference of the circle is: " + circumference);
	}

}
