package Array_Programs;

import java.util.Arrays;

public class Merge2arryas {

	public static void main(String[] args) {
		
		int[] array1 = { 1, 3, 5, 7 };
		int[] array2 = { 2, 4, 6, 8 };
		
		int[] mergedArray = new int[array1.length + array2.length];

		// Copy elements from the first array
		System.arraycopy(array1, 0, mergedArray, 0, array1.length);

		// Copy elements from the second array
		System.arraycopy(array2, 0, mergedArray, array1.length, array2.length);

		System.out.println(Arrays.toString(mergedArray));
	}
}
