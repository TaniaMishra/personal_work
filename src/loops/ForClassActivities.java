package loops;

import java.util.Scanner;

public class ForClassActivities {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//Example 1
		for(int counter = 1; counter <= 5; counter++) {
			System.out.println(counter);
		}
		
		//#1
		for (int i = 0; i < 10; i++) {
			System.out.println((i+1) + ") Hello!");
		}
		
		//#2
		for(int i = 0; i < 20; i += 2) {
			System.out.println((i+1) + ") Hello!");
		}

 		//#3
		for(int i = 0; i < 46; i += 5) {
			System.out.println((i+15) + ") Hello!");
		}

		for(int i = 0; i < 10; i++) {
			System.out.println((10-i) + ") Hello!");
		}

		System.out.println("Enter number of hello's: ");
		int number = input.nextInt();
		if (number > 0) {
			for(int i = 1; i <= number; i++) {
				System.out.println(i + ". Hello!");
			}
		}
		else {
			System.out.println("HI!");
		}

		System.out.println("What is your favorite number?");
		int favNum = input.nextInt();
		for(int i = 0; i < 10; i++) {
			System.out.println(favNum + " Hello!");
		}
		input.close();
	}
}
