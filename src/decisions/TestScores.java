package decisions;

import java.util.Scanner;

public class TestScores {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("What is the first test score?");
		double firstTest = input.nextDouble();
		System.out.println("What is the second test score?");
		double secondTest = input.nextDouble();
		
		if (firstTest > secondTest) {
			System.out.println("Great Job! You entered the scores in the right order!");
			System.out.println("Difference of test scores: " + (firstTest-secondTest));
		}
		else {
			System.out.println("Bad Job. You entered the scores in the wrong order.");
		}
		
		System.out.println("Have a nice day!");
		
		input.close();
	}

}
