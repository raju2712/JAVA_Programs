package Assignment;

import java.util.Arrays;

public class AllNullToLeftSide {

	public static void main(String[] args) {

		String[] a = { null, "qspiders", "testing", "java", null, null };
		String[] b = new String[a.length - 1];

		int index = b.length - 1;

		for (int i = b.length - 1; i >= 0; i--) {
			if (a[i] != null) {
				b[index--] = a[i];
			}
		}
		System.out.println(Arrays.toString(b));


		
		
		

	}
}
