package arrays;

import java.util.Random;
import java.util.Scanner;

public class RollingDie3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.println("How many students are in the class?");
		int students = input.nextInt();
		System.out.println("How many sides are on the die?");
		int max = input.nextInt();
		int min = 1;
		System.out.println("How many times should each student roll the die?");
		int rollsEach = input.nextInt();
		
		int[][] rolls = new int[students][rollsEach];
		
		for (int r = 0; r < students; r++) {
			for (int c = 0; c < rollsEach; c++) {
				rolls[r][c] = min + rand.nextInt(max-min+1);
			}
		}

		for (int r = 0; r < students; r++) {
			for (int c = 0; c < rollsEach; c++) {
				System.out.print(rolls[r][c] + "  ");
			}
			System.out.println("");
		}
		
		for (int c = 0; c < rollsEach; c++) {
			for (int r = 0; r < students; r++) {
				System.out.print(rolls[r][c] + "  ");
			}
			System.out.println("");
		}
		
		System.out.println("Enter a roll value:");
		int value = input.nextInt();
		int counter = 0;
		for (int r = 0; r < students; r++) {
			for (int c = 0; c < rollsEach; c++) {
				if (rolls[r][c] == value) {
					counter++;
				}
			}
		}
		System.out.println(value + " was rolled " + counter + " times.");
		
		input.close();
	}
}
