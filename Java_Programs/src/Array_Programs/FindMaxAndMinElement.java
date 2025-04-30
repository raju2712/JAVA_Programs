package Array_Programs;

public class FindMaxAndMinElement {

	public static void main(String[] args) {

		/**
		 * declare variable declare max and min value iterate over the array and COMPARE
		 * each and every min and max print min value print max value
		 */

		int[] a = { 0, 1, 2, 3, 4, 5 };

		int min = a[0];
		int max = a[0];

		for (int i = 0; i < a.length; i++) {

			if (a[i] > max) {
				max = a[i];
			}
			if (a[i] < min) {
				min = a[i];
			}
		}
		System.out.println("Min element is '" + min + "' and Max element is '" + max + "'");

	}

}
