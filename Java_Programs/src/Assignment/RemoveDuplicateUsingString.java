package Assignment;

import java.util.LinkedHashSet;

public class RemoveDuplicateUsingString {

	public static void main(String[] args) {
		LinkedHashSet set = new LinkedHashSet();
		String s = "My name is My name is john";
		
		for(int i=0; i<s.length(); i++) {
			set.add(s.charAt(i));
		}

		System.out.println(set);
	}
}
