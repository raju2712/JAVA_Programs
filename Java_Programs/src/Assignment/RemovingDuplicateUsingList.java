package Assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemovingDuplicateUsingList {

	   public static void main(String[] args) {
	        // Using List instead of array
	        List<Integer> list = Arrays.asList(1, 2, 3, 1, 2, 3, 2, 3);

	        // Use LinkedHashSet to remove duplicates and maintain insertion order
	        Set<Integer> set = new LinkedHashSet<>(list);

	        // Optional: convert set back to list
	        List<Integer> uniqueList = new ArrayList<>(set);

	        // Print the result
	        System.out.println("List after removing duplicates:");
	        for (int num : uniqueList) {
	            System.out.print(num + " ");
	        }
	    }
}
