package arrays;

import java.util.Scanner;

public class TestScores {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] testScores = new int[10];
		double average = 0;
		int highest = 0;
		int lowest = 10000;
		for (int i = 0; i < 10; i++) {
			System.out.println("Enter a test score (as an integer):");
			testScores[i] = input.nextInt();
			average += testScores[i];
			if (testScores[i] > highest) {
				highest = testScores[i];
			}
			if (testScores[i] < lowest) {
				lowest = testScores[i];
			}
		}
		average = average/10;
		
		System.out.println("Highest Score: " + highest);
		System.out.println("Lowest Score: " + lowest);
		System.out.println("Average: " + average);
		System.out.println("Test Scores:");
		for (int i = 0; i < 10; i++) {
			System.out.println(testScores[i]);
		}
		
		input.close();
	}
}
