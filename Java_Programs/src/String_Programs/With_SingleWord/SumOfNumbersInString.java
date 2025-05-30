package String_Programs.With_SingleWord;

public class SumOfNumbersInString {

	public static void main(String[] args) {

		String s = "kr15rv06rp25rr27";
		int sum =0;
		char[] ch = s.toCharArray();
		
		for (char c : ch) {
			if(Character.isDigit(c)) {
				sum += Character.getNumericValue(c);
			}
		}
		System.out.println(sum);
		
	}

}
