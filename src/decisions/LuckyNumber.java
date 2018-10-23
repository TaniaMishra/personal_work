package decisions;

import java.util.Scanner;

public class LuckyNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Are you an adult? (true or false)");
		boolean adultKid = input.nextBoolean();
		double luckyNum = 0;
		
		if (adultKid == true) {
			System.out.println("What is your height?");
			double height = input.nextDouble();
			luckyNum = height * 5;
		}
		else {
			System.out.println("What is your weight?");
			double weight = input.nextDouble();
			luckyNum = weight/2;
		}
		System.out.println("Your lucky number is " + luckyNum + "!");
		input.close();
	}

}
