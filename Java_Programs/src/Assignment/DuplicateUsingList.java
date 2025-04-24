package Assignment;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class DuplicateUsingList {

	 public static void main(String[] args) {
	        // Using a List instead of an array
	        List<Integer> list = Arrays.asList(1, 2, 3, 2, 3, 2, 3);

	        // Use LinkedHashMap to maintain insertion order
	        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();

	        for (int num : list) {
	            if (map.containsKey(num)) {
	                map.put(num, map.get(num) + 1);
	            } else {
	                map.put(num, 1);
	            }
	        }

	        // Print only numbers that occur once
	        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
	            if (entry.getValue() > 1) {
	                System.out.println(entry.getKey() + " : " + entry.getValue());
	            }
	        }
	    }
}
