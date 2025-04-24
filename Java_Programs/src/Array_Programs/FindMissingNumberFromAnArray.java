package Array_Programs;

public class FindMissingNumberFromAnArray {

	public static void main(String[] args) {

		int[] array = { 1, 2, 4, 5, 6 }; // Missing number is 3

		// Find and print the missing number
		int missingNumber = findMissingNumber(array, 6); // Array elements range from 1 to 6
		System.out.println("The missing number is: " + missingNumber);
	}

	// Method to find the missing number
	public static int findMissingNumber(int[] array, int n) {
		// Calculate the expected sum of numbers from 1 to n using the formula
		int expectedSum = n * (n + 1) / 2;

		// Calculate the actual sum of the array elements
		int actualSum = 0;
		for (int num : array) {
			actualSum += num;
		}

		// The missing number is the difference between the expected sum and the actual sum
		return expectedSum - actualSum;
	}

}
