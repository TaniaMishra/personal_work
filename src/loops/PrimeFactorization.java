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
		/*
		 * int primeCounter = 0; int counter = 0; int tester; boolean prime;
		 * //int primeNum; int j = 2; //j is a number less than NUMBER while (j
		 * <= number) { //part one: check if j is prime for (int i = 2; i <= j;
		 * i++) { //i is used to see if j is prime tester = j % i;
		 * System.out.println("j = " + j); System.out.println("i = " + i);
		 * System.out.println("j % i = " + tester); if (tester != 0) {
		 * primeCounter++; System.out.println("prime counter = " +
		 * primeCounter); } counter++; System.out.println("counter: " +
		 * counter); } if (primeCounter == counter) { prime = true; //j is
		 * prime\ System.out.println("Prime = " + prime); } else { prime =
		 * false; //j is not prime } //part two: check if j is a factor of
		 * NUMBER (only if it is prime) if (prime == true) { tester = number %
		 * j; System.out.println("Went into loop for prime = true"); if (tester
		 * == 0) { System.out.println(j); number = number/j; j = 1; //reset
		 * everything because the loop will now do the same thing but with a new
		 * NUMBER (new NUMBER = old NUMBER / j) } else { j++; //if j isn't a
		 * factor of number, do it again and check the next value of j } } else
		 * { j++; //if j isn't prime, do it again and check with the next value
		 * of j } counter = 0; }
		 */

		input.close();
	}
}
