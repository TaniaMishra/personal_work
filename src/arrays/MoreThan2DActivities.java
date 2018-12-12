package arrays;

import java.util.Random;

public class MoreThan2DActivities {
	public static void main(String[] args) {
		Random rand = new Random(3);
		int min = 0;
		int max = 50;
		int sum = 0;
		
		int[][][] numbers = new int[3][7][9];
		for (int l = 0; l < numbers.length; l++) {
			for (int h = 0; h < numbers[0].length; h++) {
				for (int w = 0; w < numbers[0][0].length; w++) {
					numbers[l][h][w] = min + rand.nextInt(max-min+1);
					sum += numbers[l][h][w];
				}
			}
		}
		
		System.out.println("The total of the values is " + sum + ".");

	}
}
