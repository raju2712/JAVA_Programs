package String_Programs.With_Sentence;

import java.util.Arrays;

public class Swap1stAndLastWord {

	public static void main(String[] args) {

		String s = "I am Raju";
		String[] str = s.split(" ");
		String temp = str[str.length-1];  //3-1 = 2   //temp = Raju
		
		str[str.length-1] = str[0];       //str[2] = I
		str[0] = temp;                    //str[0] = Raju
		
		System.out.println(Arrays.toString(str));
		
	}

}
