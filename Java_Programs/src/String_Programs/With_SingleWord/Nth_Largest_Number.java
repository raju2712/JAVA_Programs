package String_Programs.With_SingleWord;

import java.util.Arrays;
import java.util.Scanner;

public class Nth_Largest_Number {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the size of the array: ");
		int size = scanner.nextInt();

		int[] array = new int[size];
		
		System.out.println("Enter " + size + " numbers");
		for (int i = 0; i < size; i++) {
			array[i] = scanner.nextInt();
		}

		System.out.print("Enter which largest number needs to fetch");
		int N = scanner.nextInt();

		if (N > size) {
			System.out.println(N + " is greater than " + size);
		} else {
			Arrays.sort(array);
			
			int NthLargest = array[size - N];  //size - N to fetch largest number
			System.out.println(N + "th largest number is: " + NthLargest);
		}
	}
}
