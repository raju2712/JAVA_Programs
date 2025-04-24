package String_Programs_With_Sentence;

public class ReverseAsentenceWithoutReversingSpaces {

	public static void main(String[] args) {

		String s = "I am Raju";          //index 8 , length 9
		String s1 = s.replace(" ", "");  //IamRaju  , length 7
		
		int index = s1.length()-1;       //7-1 = 6
		
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)==' ') {       //if 's' has space at that index 
				System.out.print(' ');   //'s1' should also print space
			}else {
				System.out.print(s1.charAt(index--));
			}
		}
		
		
		
		
	}

}
