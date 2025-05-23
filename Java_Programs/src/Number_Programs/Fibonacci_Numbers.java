package Number_Programs;

public class Fibonacci_Numbers {

	public static void main(String[] args) {

		int a = 0;
		int b = 1;

		for (int i = 1; i <= 15; i++) {
			
			System.out.print(a + ",");  //to print horizontal
			
			int c = a + b;
			a = b;
			b = c;

		}
		
	}

}
