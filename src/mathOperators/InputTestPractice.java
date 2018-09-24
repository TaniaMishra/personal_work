package mathOperators;

import java.util.Scanner;

public class InputTestPractice {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int month = 99;
		int day = 99;
		int year = 9999;
		
		System.out.println("What month is it? (ex. 12)");
		month = input.nextInt();
		System.out.println("What day is it? (ex. 29)");
		day = input.nextInt();
		System.out.println("What year is it? (ex. 2012)");
		year = input.nextInt();
		
		System.out.println("The date is: " + month + " - " + day + " - " + year);
		
	}
}
