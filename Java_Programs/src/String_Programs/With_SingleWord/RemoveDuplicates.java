package String_Programs.With_SingleWord;

import java.util.LinkedHashSet;

public class RemoveDuplicates {

	public static void main(String[] args) {

		String s ="aabbccdeefghg";
		
		LinkedHashSet lhs = new LinkedHashSet();
		
		for(int i = 0 ; i<s.length(); i++) {
			lhs.add(s.charAt(i));
		}
		System.out.println(lhs);
	}

}
