package loops;

import java.util.Scanner;
import java.lang.Math;

public class Calculator {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean keepGoing = true;
		while (keepGoing == true) {
			System.out.println("Calculator");
			System.out.println("1. Is it a right triangle?");
			System.out.println("2. Powers");
			System.out.println("3. Square Root");
			System.out.println("4. Round Up");
			System.out.println("5. Round Down");
			System.out.println("6. Quit");
			int choice = input.nextInt();
			boolean entry;
			double answer;

			switch (choice) {
			case 1:
				do {
					System.out.println("Enter the length of one leg.");
					double leg1 = input.nextDouble();
					System.out.println("Enter the length of the other leg.");
					double leg2 = input.nextDouble();
					System.out.println("Enter the length of the hypotenuse.");
					double hypo = input.nextDouble();

					if (hypo > 0 && leg1 > 0 && leg2 > 0) {
						if ((hypo * hypo) == (leg1 * leg1) + (leg2 * leg2)) {
							System.out.println("It is a right trianlge!");
						} else {
							System.out.println("It is NOT a right triangle");
						}
						entry = true;
					} else {
						System.out.println("Invalid entry. Try again.");
						entry = false;
					}
				} while (entry == false);
				break;

			case 2:
				do {
					System.out.println("Enter the base number.");
					double base = input.nextDouble();
					System.out.println("Enter the power.");
					double power = input.nextDouble();
					if (power > 0) {
						answer = Math.pow(base, power);
						System.out.println(base + " to the power of " + power + " is " + answer);
						entry = true;
					} else {
						System.out.println("Invalid entry. Try again.");
						entry = false;
					}
				} while (entry == false);
				break;

			case 3:
				do {
					System.out.println("Enter the number to take the square root of.");
					double number = input.nextDouble();
					if (number > 0) {
						answer = Math.sqrt(number);
						System.out.println("The square root of " + number + " is " + answer);
						entry = true;
					} else {
						System.out.println("Invalid entry. Try again.");
						entry = false;
					}
				} while (entry == false);
				break;

			case 4:
				do {
					System.out.println("Enter the number to round up.");
					double number = input.nextDouble();
					if (number > 0) {
						answer = Math.ceil(number);
						System.out.println(number + " rounded up is " + answer);
						entry = true;
					} else {
						System.out.println("Invalid entry. Try again.");
						entry = false;
					}
				} while (entry == false);
				break;

			case 5:
				do {
					System.out.println("Enter the number to round down.");
					double number = input.nextDouble();
					if (number > 0) {
						answer = Math.floor(number);
						System.out.println(number + " rounded down is " + answer);
						entry = true;
					} else {
						System.out.println("Invalid entry. Try again.");
						entry = false;
					}
				} while (entry == false);
				break;

			case 6:
				System.out.println("Thank you for using the Calculator! Have a great day!");
				keepGoing = false;
				break;

			default:
				System.out.println("Please enter a valid option.");
			}
		}
		input.close();
	}
}
