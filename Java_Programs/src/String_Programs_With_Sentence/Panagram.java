package String_Programs_With_Sentence;

import java.util.HashSet;

public class Panagram {

	public static void main(String[] args) {

		String s = "The quick brown fox jumps over the lazy dog";
		String s1 = s.toLowerCase();
		HashSet hs = new HashSet();
		for(int i=0; i<s.length()-1; i++) {
			char ch = s1.charAt(i);
			if(Character.isAlphabetic(ch)) {
				hs.add(ch);
			}
		}
		if(hs.size()==26) {
			System.out.println(s + " ia Panagram");
		}else {
			System.out.println(s + " is not a Panagram");
		}
	}

}
