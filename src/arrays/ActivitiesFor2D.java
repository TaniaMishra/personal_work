package arrays;

import java.util.Random;

public class ActivitiesFor2D {
	public static void main(String[] args) {
		Random rand = new Random(5);
		int rows = 3;
		int columns = 7;
		long sum = 0;
		int[][] randNum = new int[rows][columns];
		for (int r = 0; r < randNum.length; r++) {
			for (int c = 0; c < randNum[0].length; c++) {
				randNum[r][c] = rand.nextInt(101);
				if (randNum[r][c] < 10) {
					System.out.print(randNum[r][c] + "    ");
				}
				else if (randNum[r][c] > 99) {
					System.out.print(randNum[r][c] + "  ");
				}
				else {
					System.out.print(randNum[r][c] + "   ");

				}
				sum += randNum[r][c];
			}
			System.out.println("");
		}
		System.out.println("The sum of the elements is " + sum + ".");
	}
}
