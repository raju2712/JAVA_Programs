package Array_Programs;

import java.util.Arrays;

public class FindSumOfTwoArrays {

	public static void main(String[] args) {

		/*
		 * declare 2 arrays
		 * find which is maximum from that 2 arrya
		 * then create new array to store sum values
		 * iterate over the array
		 * add elements of a when i is lesstham length of a and vice-versa for b
		 * then print sum of arrays 
		 * 
		 */
		
		int[] a = {1,2,3};
		int[] b = {4,5,6,7};
		int max = Math.max(a.length, b.length);
		
		int[] sum = new int[max];
		
		for(int i=0; i<max; i++) {
			if(i<a.length) {
				sum[i] += a[i];
			}
			if(i<b.length) {
				sum[i] += b[i];
			}
		}
		System.out.println(Arrays.toString(sum));
	}

}
