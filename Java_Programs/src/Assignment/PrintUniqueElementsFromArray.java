package Assignment;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class PrintUniqueElementsFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  int[] arr = {1, 2, 3, 2, 3, 2, 3}; // read string 

		   // Use LinkedHashMap to preserve insertion order
	        LinkedHashMap<Integer, Integer> map = new LinkedHashMap();

	        for (int num : arr) {
	            if (map.containsKey(num)) {
	                map.put(num, map.get(num) + 1);
	            } else {
	                map.put(num, 1);
	            }
	        }
	        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
	        	if(entry.getValue()==1)
	            System.out.println(entry.getKey() + " : " + entry.getValue());
	        }
			}
		}
	


