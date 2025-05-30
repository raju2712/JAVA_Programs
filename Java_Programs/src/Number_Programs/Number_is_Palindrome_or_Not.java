package Number_Programs;

import java.util.Scanner;

public class Number_is_Palindrome_or_Not {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Enter the number :");
		int n = s.nextInt();
		int original = n;
		int reversed = 0;
		
		while (n != 0) {                            //20 != 0         
            int remaining = n % 10;                 //20 % 10 = 10       121---12
            reversed = reversed * 10 + remaining;   //0 * 10 + 2 = 2     12
            n = n / 10;                             //20 / 10 = 2        12
        }

        if (original == reversed) {
            System.out.println(original + " is a palindrome");
        } else {
            System.out.println(original + " is not a palindrome");
        }
       
        
        
        
	}

}
