package Array_Programs;

import java.util.Scanner;

class StudentInfo {
	
	private String name;
	private int id;

	//Constructor
	public StudentInfo(String name, int id) {
		this.name = name;
		this.id = id;
	}

	//Getters
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}

	public void display() {
		System.out.println("ID: " + id + ", Name: " + name);
	}
}

public class StudentObjectWithAttributInAnArray {
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		//Number of students
		System.out.print("Enter the number of students: ");
		int numberOfStudents = scanner.nextInt();

		// Create an array to store Student objects
		StudentInfo[] students = new StudentInfo[numberOfStudents];

		// Input student details
		for (int i = 0; i < numberOfStudents; i++) {
			System.out.println("Enter details for student " + (i + 1) + ":");
			
			System.out.print("Enter ID: ");
			int id = scanner.nextInt();
			
			scanner.nextLine(); // Consume newline
			
			System.out.print("Enter Name: ");
			String name = scanner.nextLine();

			// Create a new Student object and store it in the array
			students[i] = new StudentInfo(name, id);
		}

		System.out.println("Stored Student Details:");
		for (StudentInfo student : students) {
			student.display();
		}
	}

}
