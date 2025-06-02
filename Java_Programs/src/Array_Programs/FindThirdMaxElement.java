package Array_Programs;

public class FindThirdMaxElement {

	public static void main(String[] args) {

		int[] a = { 1, 2, 6, 4, 3, 8 };

		int max = Integer.MIN_VALUE;
		int smax = Integer.MIN_VALUE;
		int tmax = Integer.MIN_VALUE;

		for (int i = 0; i < a.length; i++) {
			
			if (a[i] > max) {
				tmax = smax;
				smax = max;
				max = a[i];
			} else if (a[i] > smax && a[i] != max) {
				
				tmax = smax;
				smax = a[i];
			} else if (a[i] > tmax && a[i] != smax && a[i] != max) {
				
				tmax = a[i];
			}
		}
		System.out.println("Third Max element is " + tmax);
	}
}