package Number_Programs;

import java.util.Scanner;

public class Number_Divisibility {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Enter the number :");
		int n = s.nextInt();
		
		if(n%5 == 0 && n%3 == 0) {
			System.out.println("Divisible by both 5 & 3");
		}else if (n%5 == 0) {
			System.out.println("Divisible only by 5");
		}else if (n%3 == 0) {
			System.out.println("Divisible only by 3");
		}
	}

}
