package Number_Programs;

import java.util.Scanner;

public class Denomination_of_Currency {

	public static void main(String[] args) {

//		Scanner s = new Scanner(System.in);
//		System.out.println("Enter the amount :");
//		int amount = s.nextInt();
		
		int amount = 2888;

		int[] notes = { 2000, 500, 200, 100, 50, 20, 10, 5, 2, 1 };

		for (int i = 0; i < notes.length; i++) {
			int denomination = amount / notes[i]; // to get quotient
			System.out.println(notes[i] + " is " + denomination + " notes");
			amount = amount % notes[i];           // to get remainder
		}
	}
}
