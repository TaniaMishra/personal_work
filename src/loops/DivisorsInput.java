package loops;

import java.util.Scanner;

public class DivisorsInput {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an positive integer: ");
		int end = input.nextInt();
		int numDivisors = 0;
		int mostDivisors = 0;
		int number = 0;
		
		for (int j = 1; j <= end; j++) {
			for (int i = 1; i <= j; i++) {
				int tester = j % i;
				if (tester == 0) {
					numDivisors++;
				}
			}
			if (numDivisors > mostDivisors) {
				mostDivisors = numDivisors;
				number = j;
			}
			numDivisors = 0;
		}
		
		System.out.println("The integer with the most divisors from 1-" + end + " is " + number + " with " + mostDivisors + " divisors.");	
		
		input.close();
	}
}
