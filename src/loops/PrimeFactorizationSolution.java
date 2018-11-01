package loops;

import java.util.Scanner;

public class PrimeFactorizationSolution {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a positive integer: ");
		int number = input.nextInt();
		
		while (number != 0) {
			boolean found = false;
			for (int i = 2; found == false; i++) {
				if ((number % i) == 0) {
					found = true;
					System.out.println(i);
					number /= i;
				}
			}
		}

	}
}
