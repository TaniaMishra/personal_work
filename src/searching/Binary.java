package searching;

import java.util.Random;

public class Binary {
	public static void main(String[] args) {
		Random generator = new Random();
		int[] numbers = new int[100];
		for (int j = 0; j < numbers.length; j++)
			numbers[j] = generator.nextInt(500);

		// sort the Array
		someSortAscending(numbers);

		// Display the sorted array
		for (int j = 0; j < numbers.length; j++)
			System.out.println(numbers[j]);
		;

		// Looking for the number 36
		int value = 36;
		int low = 0;
		int high = numbers.length - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (numbers[mid] == value) {
				System.out.println(value + " was found at index " + mid);
				break;
			} else if (numbers[mid] < value)
				low = mid + 1;
			else
				high = mid - 1;
		}
		if (low > high)
			System.out.println(value + " was not found in the array");

	}

	public static void someSortAscending(int[] numbers) {
		int j = 0;
		int index = 0;
		for (int i = 1; i < numbers.length; i++) {
			index = numbers[i];
			j = i;
			while ((j > 0) && (numbers[j - 1] > index)) {
				numbers[j] = numbers[j - 1];
				j = j - 1;
			}
			numbers[j] = index;
		}
	}
}
