package Number_Programs;

import java.util.Scanner;

public class Factorial_Of_a_Number {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the number :");
		int n = s.nextInt();
		
		int fact = 1;
		
		for(int i=1; i<=n; i++) {
			fact = fact * i;
			//System.out.println(fact + " * " + i);
		}
		System.out.print(fact);
		
	}

}
