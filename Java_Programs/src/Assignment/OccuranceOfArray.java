package Assignment;

import java.util.LinkedHashMap;
import java.util.Map;

public class OccuranceOfArray {
	  public static void main(String[] args) {
	        int[] arr = {1, 2, 3, 1, 2, 3, 2, 3};

	        // Use LinkedHashMap to preserve insertion order
	        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();

	        for (int num : arr) {
	            if (map.containsKey(num)) {
	                map.put(num, map.get(num) + 1);
	            } else {
	                map.put(num, 1);
	            }
	        }

	        // Print the result
	        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
	            System.out.println(entry.getKey() + " : " + entry.getValue());
	        }
	    }
}
