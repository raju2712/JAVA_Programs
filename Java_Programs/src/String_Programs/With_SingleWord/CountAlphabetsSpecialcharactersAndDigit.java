package String_Programs.With_SingleWord;

public class CountAlphabetsSpecialcharactersAndDigit {

	public static void main(String[] args) {

		String s = "*r2a7j1u2$";

		int splCount = 0, alphaCount = 0, digitCount = 0;

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch >= '0' && ch <= '9') {
				digitCount++;
			} else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
				alphaCount++;
			} else {
				splCount++;
			}
		}
		
		System.out.println("Special Characters: " + splCount);
		System.out.println("Alphabets: " + alphaCount);
		System.out.println("Digits: " + digitCount);
	}
}
