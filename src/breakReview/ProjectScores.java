package breakReview;

import java.util.Scanner;

public class ProjectScores {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[][] scores = new double[2][2];
		
		for(int r = 0; r < scores[0].length; r++) {
			for (int c = 0; c < scores.length; c++) {
				System.out.println("Enter a project score: ");
				scores[r][c] = input.nextDouble();
			}
		}
		
		int numAbove150 = 0;
		double average = 0;
		for(int r = 0; r < scores[0].length; r++) {
			for (int c = 0; c < scores.length; c++) {
				if (scores[r][c] > 150) {
					numAbove150++;
				}
				average += scores[r][c];
			}
		}
		average = average/(scores.length * scores[0].length);
		
		System.out.println(numAbove150 + " students earned more than 150 points!");
		System.out.println("The class average is " + average);
		
		input.close();
	}
}
