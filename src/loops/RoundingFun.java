package loops;

import java.util.Scanner;

public class RoundingFun {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a four digit number: ");
		int number = input.nextInt();
		while (number > 999 && number < 10000) {
			int ones = number %  10;
			number = number / 10;
			int tens = number % 10;
			number = number / 10;
			int hundreds = number % 10;
			number = number / 10;
			int thousands = number;
			
		}

	}
}
