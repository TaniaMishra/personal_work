package arrays;

import java.util.Scanner;
import java.util.Random;

public class OneDimensionalClassActivities {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
/*		final int NUM = 5;
		double[] scores = new double[NUM];
		for (int i = 0; i < NUM; i++) {
			System.out.println("Enter a test score:");
			scores[i] = input.nextDouble();
		}
		
		System.out.print("Scores: ");
		for (int i = NUM-1; i >= 0; i--) {
			System.out.print(scores[i]);
			if (i != 0) {
				System.out.print(", ");
			}
			else {
				System.out.println("");
			}
		}
		
		double sum = 0;
		for (int i = 0; i < NUM; i++) {
			sum += scores[i];
		}
		
		System.out.println("Sum: " + sum);
*/		
		Random rand = new Random();
		final int NUM = 250;
		int biggest = 0;
		int[] scores = new int[NUM];
		for (int i = 0; i < NUM; i++) {
			scores[i] = rand.nextInt(1001);
			if (scores[i] > biggest) {
				biggest = scores[i];
			}
			
		}
		System.out.println("The largest score is " + biggest + ".");
		
		
		
		
		input.close();
	}
}
