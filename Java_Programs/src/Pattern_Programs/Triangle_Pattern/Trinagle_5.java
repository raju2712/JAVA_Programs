package Pattern_Programs.Triangle_Pattern;

public class Trinagle_5 {

	public static void main(String[] args) {

		int rows = 5;
		for (int i = 1; i <=rows; i++) {
			for (int j = 1; j <=rows; j++) {
				if (i >= j ) {
					System.out.print(j + " ");  //if we give i , output will be 1 22 333 4444 55555
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
