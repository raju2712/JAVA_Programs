package String_Programs.With_SingleWord;

import java.util.LinkedHashMap;
import java.util.Map;

public class FindOccurence {

	public static void main(String[] args) {

		String s = "abbaabccd";
		
		LinkedHashMap<Character, Integer> map = new LinkedHashMap();
		
		for(int i = 0 ; i < s.length() ; i++) {
			char ch = s.charAt(i);
			if(map.containsKey(ch)) {
				map.put(ch,map.get(ch) + 1);
			}else {
				map.put(ch,1);
			}
		}
		
		System.out.println(map);
		
		System.out.println("====================");
		
		//Print Unique value
		for(Map.Entry<Character,Integer> hs :map.entrySet()) {
			if(hs.getValue()==1) {
				System.out.println(hs.getKey());
			}
		}
		
		System.out.println("====================");
		
		//Print only Duplicate
		for(Map.Entry<Character,Integer> hs :map.entrySet()) {
			if(hs.getValue() > 1) {
				System.out.println(hs.getKey());
			}
		}
		
		
	}
}
