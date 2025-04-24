package Array_Programs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class EmployeeInfo {

	private int id;
	private String name;
	private double salary;

	// Constructor
	public EmployeeInfo(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	// Getters
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public void display() {
		System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
	}
}

public class EmployeeObjectWithAttributInAlist {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		List<EmployeeInfo> employeeList = new ArrayList<>();

		System.out.println("How many employees do you want to add?");
		int numberOfEmployees = scanner.nextInt();

		for (int i = 1; i <= numberOfEmployees; i++) {
			System.out.println("Enter details for Employee " + i + ":");

			System.out.print("ID: ");
			int id = scanner.nextInt();

			scanner.nextLine(); // Consume newline

			System.out.print("Name: ");
			String name = scanner.nextLine();

			System.out.print("Salary: ");
			double salary = scanner.nextDouble();

			// Create Employee object and add to the list
			EmployeeInfo ei = new EmployeeInfo(id, name, salary);
			employeeList.add(ei);
		}

		// Display all employees
		System.out.println("\nEmployees in the list:");
		for (EmployeeInfo emp : employeeList) {
			emp.display();
		}
	}

}
