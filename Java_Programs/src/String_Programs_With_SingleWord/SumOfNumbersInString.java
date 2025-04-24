package String_Programs_With_SingleWord;

public class SumOfNumbersInString {

	public static void main(String[] args) {

		String s = "kr15rv06rp25rr27";
		int sum = 0;
		
		for(int i=0; i>=s.length(); i++) {
			char ch = s.charAt(i);
			if(ch>=48 && ch<=57) {
				sum+=ch-48; //to covert char to int
			}
		}
		System.out.println(sum);
	}

}
