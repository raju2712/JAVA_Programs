package Number_Programs;

import java.util.Scanner;

public class Swap_2_Numbers_Without_Using_3rd_Variable {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Enter the number : n1");
		int n1 = s.nextInt();

		System.out.println("Enter the number : n2");
		int n2 = s.nextInt();
		
		System.out.println("Before Swaping");
		System.out.println("n1 is " + n1);
		System.out.println("n2 is " + n2);

		// concat
		n1 = n1 + n2;
		n2 = n1 - n2;
		n1 = n1 - n2;

		System.out.println("After Swaping");
		System.out.println("n1 is " + n1);
		System.out.println("n2 is " + n2);
		
		//With using 3rd variable
		
		int s1=10;
		int s2=20;
		
		System.out.println("Before Swaping");
		System.out.println("s1 is " + s1);
		System.out.println("s2 is " + s2);
		
		int temp = s1;
		s1=s2;
		s2=temp;
		System.out.println("After Swaping");
		System.out.println("s1 is " + s1);
		System.out.println("s2 is " + s2);
	}

}
