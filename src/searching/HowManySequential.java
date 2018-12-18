package searching;

import java.util.Random;

public class HowManySequential {
	public static void main(String[] args) {
		Random rand = new Random();
		int[] numbers = new int[100];
		int min = 1;
		int max = 10000;
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = min + rand.nextInt(max-min+1);
		}
		
		for (int x : numbers) {
			System.out.println(x);
		}
	}
}
