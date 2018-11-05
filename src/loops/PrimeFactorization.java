package loops;

import java.util.Scanner;

public class PrimeFactorization {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a positive integer: ");
		int number = input.nextInt();
		int primeCounter = 0;
		int counter = 0;
		boolean prime;

		while (number != 1) {
			// check if number is prime
			for (int i = 2; i < number; i++) {
				int tester = number % i;
				counter++;
				if (tester != 0) {
					primeCounter++;
				}
			}
			if (primeCounter == counter) {
				prime = true;
			} else {
				prime = false;
			}

			// Change number using one of these conditions
			if (prime == true) { // if number is prime
				System.out.println(number);
				System.out.println("1");
				number = 1;
			} else if ((number % 2) == 0) { // if number is even
				System.out.println("2");
				number /= 2;
			} else { // if number is odd
				for (int i = 3; i <= number; i += 2) {
					if ((number % i) == 0) {
						System.out.println(i);
						number /= i;
					}
				}
			}
		}
		input.close();
	}
}
