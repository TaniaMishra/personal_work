package loops;

import java.util.Scanner;

public class SumTheNumber {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num1 = input.nextInt();
		
		do {
			System.out.print("Enter another number: ");
			int num2 = input.nextInt();
			int sum = num1 + num2;
			System.out.println("Sum of the two numbers: " + sum);
			System.out.print("Enter a number (999 to quit): ");
			num1 = input.nextInt();
		}
		while (num1 != 999);
		
		input.close();
	}
}
