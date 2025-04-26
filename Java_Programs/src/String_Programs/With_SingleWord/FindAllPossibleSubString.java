package String_Programs.With_SingleWord;

public class FindAllPossibleSubString {

	public static void main(String[] args) {

		String s = "aaabbaabac";
		int length = 0;
		String s3 = "";

		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j <= s.length(); j++) {
				String s1 = s.substring(i, j);
				String s2 = new StringBuilder(s1).reverse().toString();
				if (s1.equals(s2) && length < s1.length()) {
					length = s1.length();
					s3 = s1;
				}
			}
		}
		System.out.println(s3);
		
		
		
		
		

	}

}
