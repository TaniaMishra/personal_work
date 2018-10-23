package decisions;

import java.util.Scanner;

public class Math {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		double num1 = input.nextDouble();
		System.out.println("Enter another number: ");
		double num2 = input.nextDouble();
		System.out.println("Enter the corresponding number to what you want to find.");
		System.out.println("1. Find the sum.");
		System.out.println("2. Find the difference.");
		System.out.println("3. Find the product.");
		System.out.println("4. Find the result of division.");
		System.out.println("5. Find the result of squaring the first number.");
		int operation = input.nextInt();
		double result;
		
		switch (operation) {
			case 1:
				result = num1 + num2;
				System.out.println("The sum is: " + result);
				break;
			case 2:
				result = num1 - num2;
				System.out.println("The difference is: " + result);
				break;
			case 3:
				result = num1 * num2;
				System.out.println("The product is: " + result);
				break;
			case 4:
				result = num1 / num2;
				System.out.println("The quotient is: " + result);
				break;
			case 5:
				result = num1 * num1;
				System.out.println("The first number squared is: " + result);
				break;
			default:
				System.out.println("You did not choose one of the given operations.");
		}
		
		input.close();
	}
}
