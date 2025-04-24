package String_Programs_With_SingleWord;

public class RevesrAstring {

	public static void main(String[] args) {

		String s = "Raju";
		String rev = "";
		
		for(int i = s.length()-1 ; i>=0 ; i--) {
			char ch = s.charAt(i);
			rev = rev + ch;
		}
		System.out.println(rev);
		
		if(rev.equalsIgnoreCase(s)) {
			System.out.println(s + " is a palindrome");
		}else {
			System.out.println(s + " is not a palindrome");
		}
		
	}

}
