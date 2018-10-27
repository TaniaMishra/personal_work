package loops;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = input.nextInt();
		int prime = 0;
		int counter = 0;
		
		for (int i = 2; i < number; i++) {
			int tester = number % i;
			counter ++;
			if (tester != 0) {
				prime ++;
			}
		}
		
		if (prime == counter) {
			System.out.println(number + " is prime!");
		}
		else {
			System.out.println(number + " is not prime!");
		}
		
		
		input.close();
	}
}
