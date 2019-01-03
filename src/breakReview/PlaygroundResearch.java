package breakReview;

import java.util.Scanner;

public class PlaygroundResearch {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[][] holes = new int[10][12];
		for (int r = 0; r < holes.length; r++) {
			for (int c = 0; c < holes[0].length; c++) {
				System.out.println("Height of student (0 for no student): ");
				holes[r][c] = input.nextInt();
			}
		}
		
		
		double average = 0;
		int tallest = 0;
		int shortest = 10000;
		for (int r = 0; r < holes.length; r++) {
			for (int c = 0; c < holes[0].length; c++) {
				if (holes[r][c] > tallest) {
					tallest = holes[r][c];
				}
				if (holes[r][c] < shortest) {
					shortest = holes[r][c];
				}
				average += holes[r][c];
			}
		}
		average = average/(holes.length*holes[0].length);
		
		System.out.println("Tallest Height: " + tallest);
		System.out.println("Shortest Height: " + shortest);
		System.out.println("Average: " + average);
		
		input.close();
	}

}
