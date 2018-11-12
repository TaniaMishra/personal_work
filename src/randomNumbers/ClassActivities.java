package randomNumbers;

import java.util.Scanner;
import java.util.Random;

public class ClassActivities {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		//#1
		int max = 2;
		int min = 1;
		int heads = 0;
		int tails = 0;
		
		for (int i = 0; i < 100000000; i++) {
			int number = min + rand.nextInt(max - min + 1);
			if (number == 1) {
				heads++;
			}
			else {
				tails++;
			}
		}
		
		System.out.println("Heads: " + heads + " times");
		System.out.println("Tails: " + tails + " times");

		//#2
		max = 13;
		min = 1;
		int multiples = 0;
		
		for (int i = 0; i < 87; i++) {
			int number = min + rand.nextInt(max - min + 1);
			if (number % 3 == 0) {
				multiples++;
			}
		}
		
		System.out.println("Out of the 87 random numbers, there were " + multiples + " multiples of three.");

		//#3
		min = 26;
		max = 43;
		int moreThan = 0;
		
		for (int i = 0; i < 248; i++) {
			int number = min + rand.nextInt(max - min + 1); //inches
			if (number > 36) {	//12 inches: 1 foot, 36 inches: 3 feet
				moreThan++;
			}
		}
		
		System.out.println(moreThan + " first graders in a simulated Russian fishing village are taller than 3 feet.");
		
		input.close();
	}
}
