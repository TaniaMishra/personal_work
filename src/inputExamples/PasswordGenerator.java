package inputExamples;

import java.util.Scanner;

public class PasswordGenerator {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int digit1 = 0;
		int digit2 = 0;
		int digit3 = 0;
		System.out.println("Enter one digit you would like in your password: ");
		digit1 = input.nextInt();
		System.out.println("Enter another digit you would like in your password: ");
		digit2 = input.nextInt();
		System.out.println("Enter another digit you would like in your password: ");
		digit3 = input.nextInt();
		System.out.println("These are the possible combinations for your password:");
		System.out.println("Combination 1: " + digit1 + digit2 + digit3);
		System.out.println("Combination 2: " + digit2 + digit3 + digit1);
		System.out.println("Combination 3: " + digit3 + digit1 + digit2);
		System.out.println("Combination 4: " + digit1 + digit3 + digit2);
		System.out.println("Combination 5: " + digit2 + digit1 + digit3);
		System.out.println("Combination 6: " + digit3 + digit2 + digit1);
	}
}
