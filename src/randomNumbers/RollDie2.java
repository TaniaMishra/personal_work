package randomNumbers;

import java.util.Scanner;
import java.util.Random;

public class RollDie2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random rand = new Random(5);
		
		System.out.println("Enter the number of rolls:");
		int rolls = input.nextInt();
		int min = 1;
		int max = 6;
		int ones = 0;
		int twos = 0;
		int threes = 0;
		int fours = 0;
		int fives = 0;
		int sixes = 0;
		double percentage = 0;
		
		for (int i = 0; i < rolls; i++) {
			int outcome = min + rand.nextInt(max - min + 1);
			if (outcome == 1) {
				ones++;
			}
			else if (outcome == 2) {
				twos++;
			}
			else if (outcome == 3) {
				threes++;
			}
			else if (outcome == 4) {
				fours++;
			}
			else if (outcome == 5) {
				fives++;
			}
			else {
				sixes++;
			}
		}
		
		System.out.println("Number and percentage of times a number was rolled");
		percentage = (ones/rolls) * 100;
		System.out.println("1: " + ones + " time(s); " + percentage + "%");
		percentage = (twos/rolls) * 100;
		System.out.println("2: " + twos + " time(s); " + percentage + "%");
		percentage = (threes/rolls) * 100;
		System.out.println("3: " + threes + " time(s); " + percentage + "%");
		percentage = (fours/rolls) * 100;
		System.out.println("4: " + fours + " time(s); " + percentage + "%");
		percentage = (fives/rolls) * 100;
		System.out.println("5: " + fives + " time(s); " + percentage + "%");
		percentage = (sixes/rolls) * 100;
		System.out.println("6: " + sixes + " time(s); " + percentage + "%");

		input.close();
	}
}
