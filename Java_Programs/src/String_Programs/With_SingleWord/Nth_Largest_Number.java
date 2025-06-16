package String_Programs.With_SingleWord;

import java.util.Arrays;
import java.util.Scanner;

public class Nth_Largest_Number {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the size of the array: ");
		int size = scanner.nextInt();

		int[] array = new int[size];                               //int[] array = new int[5]
		
		System.out.println("Enter " + size + " numbers");
		for (int i = 0; i < size; i++) {
			array[i] = scanner.nextInt();                          //array[0] = 1;  array[1] = 2;   array[2] = 3;
		}                                                          //array[3] = 4;  array[4] = 5;

		System.out.print("Enter which largest number needs to fetch");
		int N = scanner.nextInt();                                 //n = 2;

		if (N > size) {
			System.out.println(N + " is greater than " + size);
		} else {
			Arrays.sort(array);
			
			int NthLargest = array[size - N];                    //N - 1 to fetch Smallest number
			System.out.println(N + "th largest number is: " + NthLargest);
		}
	}
}
