package Pattern_Programs.Triangle_Pattern;

public class Trinagle_4 {

	public static void main(String[] args) {

		int rows = 3;
		for (int i = 1; i <=rows; i++) {
			for (int j = 1; j <=rows; j++) {
				if (i+j>= rows+1) {                  //  >=row+1
					System.out.print("* ");          //right to left diagonal and lower
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		

		
	}

}
