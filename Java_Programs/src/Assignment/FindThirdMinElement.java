package Assignment;

public class FindThirdMinElement {

	public static void main(String[] args) {

		int[] a = { 1, 2, 6, 4, 3, 8 };

		int min = Integer.MAX_VALUE;
		int smin = Integer.MAX_VALUE;
		int tmin = Integer.MAX_VALUE;

		for (int i = 0; i < a.length; i++) {

			if (a[i] < min) {
				tmin = smin;
				smin = min;
				min = a[i];
			} else if (a[i] < smin && a[i] != min) {
				tmin = smin;
				smin = a[i];
			} else if (a[i] < tmin && a[i] != min && a[i] != smin) {
				tmin = a[i];
			}
		}
		System.out.println("Second Min element is " + tmin);

	}

}
