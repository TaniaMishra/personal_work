package loops;

import java.util.Scanner;

public class HowManyNumbers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = input.nextInt();
		int sum = number;
		do {
			System.out.println("Sum: " + sum);
			System.out.println("Enter a number: ");
			number = input.nextInt();
			sum += number;
		}
		while (sum < 2018);
		
		input.close();
	}
}
