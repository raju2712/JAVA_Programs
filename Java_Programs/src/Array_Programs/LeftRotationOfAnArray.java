package Array_Programs;

import java.util.Arrays;

public class LeftRotationOfAnArray {

	// Rotate 1 time

	public static void main(String[] args) {

		int[] a = { 0, 1, 2, 3, 4, 5 };

		int temp = a[0];

		for (int i = 0; i < a.length - 1; i++) {

			a[i] = a[i + 1];
		}
		a[a.length - 1] = temp;
		System.out.println(Arrays.toString(a));

	}

	// Rotate 4 times

//	public static void main(String[] args) {
//
//		int[] a = { 0, 1, 2, 3, 4, 5 };
//
//		for(int i=0; i<=4; i++) {
//			
//			int temp = a[0];
//
//			for (int j = 0; j < a.length - 1; j++) {
//
//				a[j] = a[j + 1];
//			}
//			a[a.length - 1] = temp;
//		}
//		System.out.println(Arrays.toString(a));
//
//	}

}
