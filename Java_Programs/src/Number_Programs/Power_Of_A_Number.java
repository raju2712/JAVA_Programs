package Number_Programs;

import java.util.Scanner;

public class Power_Of_A_Number {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Enter the number :");
		int n = s.nextInt();   //10

		System.out.println("Enter Power of " + n);
		int power = s.nextInt();   //2

		int prod = 1;

		for (int i = 1; i <= power; i++) {
			prod = prod * n;
		}
		System.out.println(prod);
	
	}

}
