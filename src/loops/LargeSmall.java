package loops;

import java.util.Scanner;

public class LargeSmall {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Test Score (9999 to quit): ");
		double score = input.nextDouble();
		double big = score;
		double small = score;
		
		while (score != 9999) {
			if (score > big) {
				big = score;
			}
			if (score < small) {
				small = score;
			}
			System.out.print("Test Score (9999 to quit): ");
			score = input.nextDouble();
		}
		input.close();
	}
}
