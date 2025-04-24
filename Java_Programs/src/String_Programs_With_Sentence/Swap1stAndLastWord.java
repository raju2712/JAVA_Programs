package String_Programs_With_Sentence;

import java.util.Arrays;

public class Swap1stAndLastWord {

	public static void main(String[] args) {

		String s = "I am Raju";
		String[] str = s.split(" ");
		String temp = str[str.length-1];
		str[str.length-1] = str[0];
		str[0] = temp;
		System.out.println(Arrays.toString(str));
		
	}

}
