package Array_Programs;

import java.util.LinkedHashSet;

public class FindSumOfElementEqualToSpecificNumber {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 1 };
		int targetSum = 9;

		LinkedHashSet lhs = new LinkedHashSet();

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (a[i] + a[j] == targetSum) {
					String sum = a[i] > a[j] ? "(" + a[j] + "," + a[i] + ")" : "(" + a[i] + "," + a[j] + ")"; // ternary condition
																												
					lhs.add(sum);
				}
			}
		}
		System.out.println(lhs);

	}

}
