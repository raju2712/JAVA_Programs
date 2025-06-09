package String_Programs.With_SingleWord;

public class ReverseAstring_and_Palindrome {

	public static void main(String[] args) {

		String s = "Raju";
		String rev = "";

		for (int i = s.length() - 1; i >= 0; i--) {
			char ch = s.charAt(i);
			rev = rev + ch;
		}
		System.out.println(rev);

		// ===============FOR PALINDROME================== //

		if (rev.equalsIgnoreCase(s)) {
			System.out.println(s + " is a palindrome");
		} else {
			System.out.println(s + " is not a palindrome");
		}

	}
}
