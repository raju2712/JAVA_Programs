package Array_Programs;

import java.util.HashSet;

public class FindDuplicateElementsInAnArray {

	public static void main(String[] args) {

		int[] arr = {1, 2, 3, 2, 4, 3};

		HashSet<Integer> set = new HashSet<>();

		for (int num : arr) {
		    if (!set.add(num)) {
		        System.out.println("Duplicate: " + num);
		    }
		}
	}

}
