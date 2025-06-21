package String_Programs.With_Sentence;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateWords {

	public static void main(String[] args) {      // Output - HELLO HI BYE
		
		String s = "HELLO HI HELLO BYE";          
		String[] str = s.split(" ");              // [HELLO, HI, HELLO, BYE]
		
		Set<String> hs = new LinkedHashSet<>();     //Insertion Order maintained
		for(int i=0; i<=str.length-1; i++) {
			hs.add(str[i]);
		}
		//System.out.println(hs);                //------Print as SET
		
		for (String word : hs) {
			System.out.print(word+" ");          //------print as String
		}
	}
}
