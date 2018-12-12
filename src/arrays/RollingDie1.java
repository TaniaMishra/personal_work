package arrays;

import java.util.Scanner;
import java.util.Random;

public class RollingDie1 {
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
		
		input.close();
	}
}
