package javaoops;

import java.util.Scanner;

public class Employee {
	private int id;
	private String firstName;
	private String lastName;
	private int salary;

	public Employee(int id, String firstName, String lastName, int salary) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getName() {
		return firstName + " " + lastName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getAnnualSalary() {
		return salary * 12;
	}

	public void raiseSalary(int percent) {
		double raise = salary * (percent / 100.0);
		salary += raise;
	}

	@Override
	public String toString() {
		return "Employee[id=" + id + ",name=" + getName() + ",salary=" + salary + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Assuming you want to create an Employee object using input from the console.

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Employee ID: "); // Input Employee Id
		int id = sc.nextInt();

		System.out.print("Enter First Name: "); // Input First Name
		String firstName = sc.next();

		System.out.print("Enter Last Name: "); // Input Last Name
		String lastName = sc.next();

		System.out.print("Enter Salary: "); // Input Salary
		int salary = sc.nextInt();

		Employee employee = new Employee(id, firstName, lastName, salary);

		System.out.print("Enter the percentage to raise the salary: "); // Input Percentage value
		int percent = sc.nextInt();

		employee.raiseSalary(percent);

		System.out.println("Updated Employee Details: " + employee); // Output will be displayed

	}

}
