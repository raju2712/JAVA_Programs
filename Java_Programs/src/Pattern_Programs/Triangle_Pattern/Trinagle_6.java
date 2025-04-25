package Pattern_Programs.Triangle_Pattern;

public class Trinagle_6 {

	public static void main(String[] args) {

		int rows = 5;
		for (int i = 1; i <=rows; i++) {
			int k = 1;
			for (int j = 1; j <=rows; j++) {
				if (i+j >= rows+1) {
					System.out.print( k++ + " ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
