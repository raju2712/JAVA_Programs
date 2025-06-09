package String_Programs.With_SingleWord;

import java.util.Arrays;
import java.util.Scanner;

public class Nth_Smallest_Number {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the size of the array: ");
		int size = scanner.nextInt();

		int[] array = new int[size];

		System.out.print("Enter " + size + " numbers");
		for (int i = 0; i < size; i++) {
			array[i] = scanner.nextInt();
		}

		System.out.print("Enter which smallest number needs to fetch");
		int N = scanner.nextInt();

		if (N > size) {
			System.out.println(N + " is greater than given " + size);
		} else {
			Arrays.sort(array);

			int NthSmallest = array[N - 1]; //N - 1 to fetch smallest number
			System.out.println(N + "th Smallest number is : " + NthSmallest);
		}

	}
}
