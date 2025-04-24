package String_Programs_With_Sentence;

public class Convert1stLetterOfWordsToUppercase {

	public static void main(String[] args) {

		String s = "i am raju";
		String[] str = s.split(" ");
		for(int i=0; i<str.length; i++) {
			String s1 = str[i];
			System.out.print(Character.toUpperCase(s1.charAt(0)) + s1.substring(1) + " ");
		}
	}

}
