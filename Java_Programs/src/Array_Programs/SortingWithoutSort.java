package Array_Programs;

import java.util.Arrays;

public class SortingWithoutSort {                    //  Bubble Sorting

	public static void main(String[] args) {

		int[] a={2,6,8,25,63,84,1};
		
		for(int i=0; i<=a.length-1; i++) {
			for(int j=0; j<=a.length-1; j++) {
				if(a[i] < a[j]) {                    //   > for descending order
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}
}
