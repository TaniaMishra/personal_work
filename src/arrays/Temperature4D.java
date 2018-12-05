package arrays;

import java.util.Random;

public class Temperature4D {
	public static void main(String[] args) {
		Random rand = new Random();
		int min = -20;
		int max = 110;
		int[][][][] temp = new int[10][12][4][7];
		for (int y = 0; y < temp.length; y++) {
			for (int m = 0; m < temp[0].length; m++) {
				for (int w = 0; w < temp[0][0].length; w++) {
					for (int d = 0; d < temp[0][0][0].length; d++) {
						temp[y][m][w][d] = min + rand.nextInt(max-min+1);
					}
				}
			}
		}
		
		int greatestTemp = min;
		int greatestY = 0;
		int greatestM = 0;
		int greatestW = 0;
		int greatestD = 0;

		for (int y = 0; y < temp.length; y++) {
			for (int m = 0; m < temp[0].length; m++) {
				for (int w = 0; w < temp[0][0].length; w++) {
					for (int d = 0; d < temp[0][0][0].length; d++) {
						if (temp[y][m][w][d] > greatestTemp) {
							greatestTemp = temp[y][m][w][d];
							greatestY = y;
							greatestM = m;
							greatestW = w;
							greatestD = d;
						}
					}
				}
			}
		}
		
		System.out.println("The greatest daily temperature was " + greatestTemp + " degrees on " + greatestM + "/" + greatestD + "/" + greatestY + " (week " + greatestW + ").");

	}
}
