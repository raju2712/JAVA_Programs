package Number_Programs;

import java.util.Scanner;

public class Prime_Number {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the number :");
		int n = s.nextInt();

		Boolean flag = true;
		
		if (n < 2) {
			flag = false;
		} else {
			for (int i = 2; i <= n - 1; i++) {
				if (n % i == 0) {
					flag = false;
					break;
				}
			}
		}
		if (flag == false) {
			System.out.println(n + " is not a prime number");
		} else {
			System.out.println(n + " is a prime number");
		}

	}

}
