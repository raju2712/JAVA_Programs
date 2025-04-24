package String_Programs_With_SingleWord;

public class ExpandTheString {

	public static void main(String[] args) {
		
		String s = "a1b2c3d4e5f6g7h8i9j0";
		
		for(int i=0; i<s.length(); i=i+2) {
			int count = s.charAt(i+1) - 48;  //to convert string to number
			char ch = s.charAt(i);
			for(int j=1; j<=count; j++) {
				System.out.print(ch);
			}
		}
	}
}
