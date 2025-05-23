package String_Programs.With_SingleWord;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {

		String s1 ="Race";
		String s2 ="Care";
		
		if(s1.length()==s2.length()) {
			
			//Converting the strings to lowercase and array
			char[] ch1 = s1.toLowerCase().toCharArray();     //   [r, a, c, e]
			char[] ch2 = s2.toLowerCase().toCharArray();     //   [c, a, r, e]
			
			//Sort
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			
			if(Arrays.equals(ch1,ch2)) {
				System.out.println(s1 +" and" +s2+ " Strings are an anagrams");
			}else {
				System.out.println(s1 +" and" +s2+ " Strings are not an anagrams");
			}
			
		}else {
			System.out.println("Length of the "+s1+" and"+s2 +" strings are different,So its not an anagram");
		}
		
		
	}

}
