package Assignment;

import java.util.LinkedHashMap;

public class OccuranceOfElementsFromString {

	
public static void main(String[] args) {
		
		String s= "My name is My name is Raju"; 
		//String s = "abbaabccd";
		LinkedHashMap<Character, Integer> map = new LinkedHashMap();
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
			}else {
				map.put(ch , 1);
			}
		}
		System.out.println(map);
	}

}
