package String_Programs_With_SingleWord;

import java.util.LinkedHashSet;

public class RemoveDuplicates {

	public static void main(String[] args) {

		LinkedHashSet lhs = new LinkedHashSet();
		String s ="aabbccdeefghg";
		
		for(int i = 0 ; i<s.length(); i++) {
			lhs.add(s.charAt(i));
		}
		System.out.println(lhs);
	}

}
