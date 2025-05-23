package Pattern_Programs.Triangle_Pattern;

public class Trinagle_3 {
	
	/*
	 * 11 12 13
	 * 21 22 23
	 * 31 32 33
	 */

	public static void main(String[] args) {

		for (int i = 1; i <=3 ; i++) {
			for (int j = 1; j <=3 ; j++) {
				if (i+j<=4) {                  //  i+j<=row+1
					System.out.print("* ");    //right to left diagonal and upper
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		
		
		
		
		
	}

}
