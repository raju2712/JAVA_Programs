package Array_Programs;

public class FindSecondMaxDigit {

	public static void main(String[] args) {

		int[] a = { 0, 1, 2, 3, 4, 5, 6 };

		int max = Integer.MIN_VALUE;
		int smax = Integer.MIN_VALUE;

		for (int i = 0; i < a.length; i++) {

			if (a[i] > max) {
				smax = max;
				max = a[i];
			} else if (a[i] > smax && a[i] != max) {
				smax = a[i];
			}
		}
		System.out.println("Second Maximum digit is " + smax);
		
		// second method
		
		int[] arr = {10, 5, 20, 8, 15};

		int largest = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;

		for (int num : arr) {
		    if (num > largest) {
		        second = largest;
		        largest = num;
		    } else if (num > second && num != largest) {
		        second = num;
		    }
		}

		System.out.println("Second Maximum digit is " + second);
	}
}
