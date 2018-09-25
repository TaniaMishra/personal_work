package mathOperators;

import java.util.Scanner;

public class AverageTests {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int score1 = 0;
		int score2 = 0;
		int score3 = 0;
		double average = 0;
		
		System.out.println("What is the score of the first test?");
		score1 = input.nextInt();
		System.out.println("What is the score of the second test?");
		score2 = input.nextInt();
		System.out.println("What is the score of the third test?");
		score3 = input.nextInt();
		
		average = ((double)score1 + (double)score2 + (double)score3) / 3.0;
		
		System.out.println("The scores were " + score1 + ", " + score2 + ", and " + score3 + ".");
		System.out.println("The average is " + average + ".");
	}
}
