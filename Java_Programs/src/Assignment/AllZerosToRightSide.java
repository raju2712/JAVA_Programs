package Assignment;

import java.util.Arrays;

public class AllZerosToRightSide {

	public static void main(String[] args) {

		// Print zeros in RIGHT side

		int[] a = { 0, 1, 0, 2, 3, 4, 0, 5, 0, 6 };
		int[] b = new int[a.length - 1];

		int index = 0;

		for (int i = b.length - 1; i >= 0; i--) {
			if (a[i] != 0) {
				b[index++] = a[i];
			}
		}
		System.out.println(Arrays.toString(b));

		
		

	}
}
