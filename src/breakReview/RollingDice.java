package breakReview;

import java.util.Random;

public class RollingDice {
	public static void main(String[] args) {
		Random rand = new Random();
		int[] numbers = new int[487];
		int min = 1;
		int max = 6;
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = min + rand.nextInt(max-min+1);
		}

		for (int i = numbers.length-1; i >= 0; i--) {
			System.out.println(numbers[i]);
		}
		
		double percentage = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 != 0) {		//if odd
				percentage++;
			}
		}
		percentage = percentage/numbers.length;		//decimal
		percentage = percentage * 100;		//percentage
		System.out.println(percentage + "% of the rolls were odd.");
	}
}
