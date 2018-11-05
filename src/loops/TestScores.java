package loops;

import java.util.Scanner;

public class TestScores {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Test Score (9999 to quit): ");
		double score = input.nextDouble();
		double sum = 0;
		int count = 0;
		
		while (score != 9999) {
			sum += score;
			count ++;
			System.out.println("Test Score (9999 to quit): ");
			score = input.nextDouble();
		}
		
		double average = sum/count;
		System.out.println("Sum of the test scores: " + sum);
		System.out.println("Average of the test scores: " + average);

		input.close();
	}
}
