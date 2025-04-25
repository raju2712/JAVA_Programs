package Array_Programs;

import java.util.Map.Entry;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class FindPositionsOfAllDuplicateElements {

	public static void main(String[] args) {

		/*
		 * Create an array
		 * creae an map( Integer , ArrayList)
		 * Using containsKey method find the number is present in the map or not , if yes add the position to the array list
		 * if the map doesn't contains the key add the element and list to the map
		 * print the map
		 */
		
		int[] a = {1,2,3,1,2,3,3,4};
		
		LinkedHashMap<Integer, ArrayList<Integer>> lhm = new LinkedHashMap();
		
		for (int i = 0; i < a.length; i++) {
			if (lhm.containsKey(a[i])) {
				lhm.get(a[i]).add(i);
			}else {
				lhm.put(a[i], new ArrayList<Integer>());
			}	
		}
		
		for (Entry<Integer,ArrayList<Integer>> map : lhm.entrySet()) {
			if(map.getValue().size()>0) {
				System.out.println(map.getKey() + " "+map.getValue());
			}
		}
		
		
		
		
	}

}
