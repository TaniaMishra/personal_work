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


		double daysSum = 0;
		double counter = 0;
		double monthAverage = 0;
		double highestMonthTemp = -20;
		double highestY = -1;
		double highestM = -1;
		
		for (int y = 0; y < temp.length; y++) {
			for (int m = 0; m < temp[0].length; m++) {
				for (int w = 0; w < temp[0][0].length; w++) {
					for (int d = 0; d < temp[0][0][0].length; d++) {
						daysSum += temp[y][m][w][d];
						counter++;
					}
				}
				monthAverage = daysSum/counter;
				if (monthAverage > highestMonthTemp) {
					highestMonthTemp = monthAverage;
					highestY = y;
					highestM = m;
				}
				daysSum = 0;
			}
		}
		
		System.out.println("The highest average monthly temperature was " + highestMonthTemp + " degrees in month " + highestM + ", year " + highestY + ".");
		
		for (int m = 0; m < temp[0].length; m++) {
			for (int w = 0; w < temp[0][0].length; w++) {
				for (int d = 0; d < temp[0][0][0].length; d++) {
					System.out.print(temp[0][m][w][d] + "   ");
				}
				System.out.println("");
			}
			System.out.println("");
		}
		
		
		
	}
}
