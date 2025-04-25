package Pattern_Programs.Trinagle_Pattern;

public class Trinagle_2 {

	public static void main(String[] args) {

		for (int i = 1; i <= 3; i++) {
			for (int j = 0; j <= 3; j++) {
				if (i <= j) {
					System.out.print("* ");    //left to right diagonal and upper
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		
		
		
		
		
	}

}
