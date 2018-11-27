package arrays;

import java.util.Scanner;

public class TestScores {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] testScores = new int[10];
		double average = 0;
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Enter a test score (as an integer):");
			testScores[i] = input.nextInt();
			average += testScores[i];
		}
		average = average/10;
		
		System.out.println("Test Scores:");
		for (int i = 0; i < 10; i++) {
			System.out.println(testScores[i]);
		}
		
		System.out.println("Average: " + average);
		
		
		
	}
}
