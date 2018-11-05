package loops;

import java.util.Scanner;

public class RoundingFun {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a four digit number (999 to quit): ");
		int number = input.nextInt();
		while (number != 999 && number > 999 && number < 10000) {
			int ones = number % 10;	
			number = number / 10;
			int tens = number % 10;
			number = number / 10;
			int hundreds = number % 10;
			number = number / 10;
			int thousands = number;
			if (tens >= 5) {
				hundreds++;
				if (hundreds >= 10) {
					hundreds = 0;
					thousands++;
				}
			}
			System.out.println(thousands + "" + hundreds + "00");
			System.out.println("Enter a four digit number (999 to quit): ");
			number = input.nextInt();
		}
		input.close();
	}
}
