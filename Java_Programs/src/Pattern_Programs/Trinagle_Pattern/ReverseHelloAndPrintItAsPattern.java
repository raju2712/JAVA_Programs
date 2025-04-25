package Pattern_Programs.Trinagle_Pattern;

public class ReverseHelloAndPrintItAsPattern {

	public static void main(String[] args) {

		String s = "Hello";
		s = new StringBuilder(s).reverse().toString();
		
		for (int i = 1; i <=s.length(); i++) {

			System.out.println(s.substring(0,i));
				
			}

		
		
		}
}


