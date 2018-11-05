package loops;

import java.util.Scanner;

public class DoWhileClassActivities {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//#1
/*		int magicNum;
		System.out.print("Please enter a number: ");
		int number = input.nextInt();
		do {
			magicNum = number*17;
			System.out.println("Magic product is: " + magicNum);
			System.out.print("Please enter a number (9999 to quit): ");
			number = input.nextInt();
		}
		while(number != 9999);
*/		
		//#2
		System.out.print("Please enter a number: ");
		int number = input.nextInt();
		int big = number;
		int small = number;
		do {
			if (number > big) {
				big = number;
			}
			if (number < small) {
				small = number;
			}
			System.out.print("Please enter a number (9999 to quit): ");
			number = input.nextInt();
		}
		while(number != 9999);
		int range = big-small;
		System.out.println("The range of numbers that you entered in is: " + range);
		input.close();
	}
}
