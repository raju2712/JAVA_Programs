package Assignment;

import java.util.LinkedHashSet;

public class RemoveDuplicateFromString {

	public static void main(String[] args) {
		LinkedHashSet lhs = new LinkedHashSet();
		String s = "My name is My name is john";
		
		for(int i = 0 ; i<s.length(); i++) {
			lhs.add(s.charAt(i));
		}
		System.out.println(lhs);
	}
	}

