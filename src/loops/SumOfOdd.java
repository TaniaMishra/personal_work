package loops;

import java.util.Scanner;

public class SumOfOdd {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a positive number: ");
		int positive = input.nextInt();
		int sumOdd = 0;
		
		for (int i = 1; i < positive; i += 2) {
			sumOdd += i;
		}
		
		System.out.println(sumOdd);

		input.close();
	}
}
