package arrays;

import java.util.Scanner;
import java.util.Random;

public class RollADie2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		int min = 1;
		int max = 6;
		int numRolls = 10000;
		int[] rolls = new int[numRolls];

		for (int i = 0; i < numRolls; i++) {
			rolls[i] = min + rand.nextInt(max - min + 1);
		}

		System.out.println("Enter a roll value (-1 to quit): ");
		int rollValue = input.nextInt();

		while (rollValue != -1) {
			if (rollValue > 0 && rollValue <= 6) {
				System.out.println("Rolls that the requested roll value was rolled:");
				for (int i = 0; i < numRolls; i++) {
					if (rolls[i] == rollValue) {
						System.out.println(i);
					}
				}
			}
			else {
				System.out.println("Remember, it is a 6-sided die!");
			}
			System.out.println("Enter a roll value (-1 to quit): ");
			rollValue = input.nextInt();
		}
		System.out.println("Toodles!");
	}
}
