package Assignment;

import java.util.LinkedHashMap;

public class OccuranceOfString {

	
public static void main(String[] args) {
		
		String s= "My name is My name is john"; // read string 
		//linkedhashmap ===> to store the character occurance 
		//key==> character value ==> integer
		LinkedHashMap<Character, Integer> map = new LinkedHashMap();
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			//if ch is present in the map 
			//fetch the value and add 1 to it
			if (map.containsKey(ch)) {
				//add the key value to the map // fetch and add value
				map.put(ch, map.get(ch)+1);
			}else {
				map.put(ch , 1);
				
			}
		}
		System.out.println(map);

	}

}
