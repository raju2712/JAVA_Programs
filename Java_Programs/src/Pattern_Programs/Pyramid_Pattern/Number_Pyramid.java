package Pattern_Programs.Pyramid_Pattern;

import java.util.Scanner;

public class Number_Pyramid {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Enter number of rows : ");
		int rows = s.nextInt();
		
		    //rows
		for (int i = 1; i <=rows; i++) {
			//Space
			for (int j = 1; j <= 2*(rows-i); j++) {
				System.out.print(" ");
			}
			//Increase number
			for (int k = 1; k <= i; k++) {
				System.out.print(k + " ");
			}
			//decrease number
			for (int l = i-1; l >= 1; l--) {
				System.out.print(l + " ");
			}
			System.out.println();
		}
	
	}

}
