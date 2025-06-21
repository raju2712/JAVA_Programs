package Array_Programs;

import java.util.Arrays;

public class AllNullToRightSide {

	public static void main(String[] args) {

		String[] a = { null, "spiders", "testing", "java", null, null };
		String[] b = new String[a.length - 1];

		int index = 0;

		for (int i = 0; i <= b.length; i++) {
			if (a[i] != null) {
				b[index++] = a[i];
			}
		}
		System.out.println(Arrays.toString(b));
	}
}
