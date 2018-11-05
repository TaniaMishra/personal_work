package loops;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter positive integer: ");
		int number = input.nextInt();
		int factorial = 1;
		
		for (int i = 1; i <= number; i++) {
			factorial *= i;
		}
		
		System.out.println(number + "! = " + factorial);
		
		input.close();
	}
}
