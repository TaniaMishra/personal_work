package decisions;

import java.util.Scanner;

public class AgeDecision {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("What is your age?");
		double age = input.nextDouble();
		
		System.out.println("I hope you are having a great day!");
		
		if (age <= 17) {
			System.out.println("You are getting an A in this class.");
		}
		
		input.close();
	}

}
