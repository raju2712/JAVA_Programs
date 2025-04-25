package Pattern_Programs.Pyramid_Pattern;

import java.util.Scanner;

public class Pyramid_1 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Enter number of rows : ");
		int rows = s.nextInt();

		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= (rows * 2 - 1); j++) {
				if ((i + j >= rows + 1) && (j - i <= rows - 1)) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}

}
