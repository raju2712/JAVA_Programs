package String_Programs.With_Sentence;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class OccurnceOfDuplicateCharInString {

	public static void main(String[] args) {

		String s = "My name is My name is john"; 

		LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			} else {
				map.put(ch, 1);
			}
		}
		
		System.out.println(map);
		
		System.out.println("============================");
		
		for (Entry<Character, Integer> hs : map.entrySet()) {
			if (hs.getValue() > 1) {
				System.out.println(hs.getKey()+" "+hs.getValue());
			}
		}
	}
}
