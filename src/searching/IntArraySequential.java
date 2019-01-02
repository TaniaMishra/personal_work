package searching;

import java.util.Scanner;
import java.util.Random;

public class IntArraySequential {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random rand = new Random();

		int[] numbers = new int[100];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = 1 + rand.nextInt(10000);
		}

		boolean keepGoing = true;
		while (keepGoing == true) {
			System.out.print("Enter a number: ");
			int num = input.nextInt();
			boolean there = false;
			for (int x : numbers) {
				if (x == num) {
					there = true;
				}
			}
			if (there == true) {
				System.out.println(num + " is in the array!");
			}
			else {
				System.out.println(num + " is not in the array.");
			}
			System.out.println("Keep going? (true or false)");
			keepGoing = input.nextBoolean();
		}
		System.out.println("Goodbye!");
		input.close();
	}
}
