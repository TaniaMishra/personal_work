package loops;

import java.util.Scanner;

public class Divisors {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a positive integer: ");
		int number = input.nextInt();
		int divisors = 0;
		
		for (int i = 1; i <= number; i++) {
			int tester = number % i;
			if (tester == 0) {
				divisors++;
			}
		}
		
		System.out.println("Number of Divisors: " + divisors);
		
		input.close();
	}
}
