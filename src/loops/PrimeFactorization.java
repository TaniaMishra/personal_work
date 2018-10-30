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
		int primeNum;
		
		for (int i = 2; i < number; i++) {
			int tester = number % 1;
			if (tester != 0) {
				primeCounter++;
			}
		}
		if (primeCounter == counter) {
			prime = true;
		}
		else {
			prime = false;
		}
		
		
		//checks if a number is prime
		for (int i = 2; i < number; i++) {
			int tester = number % 1;
			if (tester != 0) {
				primeCounter++;
			}
			counter++;
		}
		if (primeCounter == counter) {
			prime = true;
		}
		else {
			prime = false;
		}
		System.out.println("Prime? " + prime);

		
	}
}
