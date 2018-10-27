package loops;

import java.util.Scanner;

public class LargestDivisor {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a positive integer: ");
		int number = input.nextInt();
		int biggest = 0;
		
		//divisor can't be itself - so i != 1 because then number/i or number/1 would be itself - and be the biggest
		for (int i = 2; i <= number; i++) {
			int tester = number % i;
			int divisor = number / i;
			if (tester == 0 && divisor > biggest) {
				biggest = divisor;
			}
		}
		
		input.close();
	}
}
