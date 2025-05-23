package Pattern_Programs.Triangle_Pattern;

public class Trinagle_1 {

	public static void main(String[] args) {

		/*
		 *  11 12 13
		 *  21 22 23 
		 *  31 32 33 
		 *  
		 *  Rows i is same
		 *  Column j is same
		 */
		
		for (int i = 1; i <=3; i++) {
			for (int j = 1; j <=3; j++) {
				if (i >= j) {
					System.out.print("* ");    // i>=j ---- left to right diagonal and lower
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
	
		
	}

}
