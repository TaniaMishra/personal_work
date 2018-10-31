package loops;

import java.util.Scanner;

public class PrimeFactorization {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a positive integer: ");
		int number = input.nextInt();
		int primeCounter = 0;
		int counter = 0;
		int tester;
		boolean prime;
		//int primeNum;
		int j = 2;	//j is a number less than NUMBER
		while (j <= number) {
			//part one: check if j is prime
			for (int i = 2; i <= j; i++) {	//i is used to see if j is prime
				tester = j % i;
				//System.out.println("j % i = " + tester);
				if (tester != 0) {
					primeCounter++;
				}
				counter++;
			}
			if (primeCounter == counter) {
				prime = true;	//j is prime
			}
			else {
				prime = false;	//j is not prime
			}
			//part two: check if j is a factor of NUMBER (only if it is prime)
			if (prime == true) {
				tester = number % j;
				if (tester == 0) {
					System.out.println(j);
					number = number/j;
					j = 1;	//reset everything because the loop will now do the same thing but with a new NUMBER (new NUMBER = old NUMBER / j)
				}
				else {
					j++;	//if j isn't a factor of number, do it again and check the next value of j
				}
			}
			else {
				j++;	//if j isn't prime, do it again and check with the next value of j
			}
		}
		
		
		
		//checks if a number is prime
		/*for (int i = 2; i < number; i++) {
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
*/
		input.close();
	}
}
