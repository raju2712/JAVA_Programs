package String_Programs_With_Sentence;

public class Convert1stLetterOfWordsToUppercase {

	public static void main(String[] args) {

		String s = "i am raju";
		String[] str = s.split(" ");   //iamraju
		
		for(int i=0; i<str.length; i++) {
			String s1 = str[i];       //it will fetch 0th index value and store in s1
			System.out.print(Character.toUpperCase(s1.charAt(0)) + s1.substring(1) + " ");   //1st letter of that stored word is uppercased
		}
		
		
		
	}
}
