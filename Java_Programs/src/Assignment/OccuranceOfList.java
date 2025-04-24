package Assignment;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OccuranceOfList {

	  public static void main(String[] args) {
	        // Given list of integers
	        List<Integer> numbers = Arrays.asList(1, 2, 3, 1, 2, 3, 2, 3);

	        // HashMap to store the frequency of each number
	        Map<Integer, Integer> frequencyMap = new HashMap<>();

	        // Loop through the list and update the frequency in the map
	        for (int num : numbers) {
	            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
	        }

	        // Print the frequency of each number
	        System.out.println("Occurrences of each integer:");
	        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
	            System.out.println(entry.getKey() + " occurs " + entry.getValue() + " times");
	        }
	    }
}
