package loops;

import java.util.Scanner;

public class Cube {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int cubed = 0;
		System.out.print("Enter an integer (-1 to quit): ");
		int number = input.nextInt();
		while (number != -1) {
			cubed = number * number * number;
			System.out.println("Your number cubed: " + cubed);
			System.out.println("Enter an integer (-1 to quit): ");
			number = input.nextInt();
		}
		
		input.close();
	}
}
