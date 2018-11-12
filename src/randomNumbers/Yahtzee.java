package randomNumbers;

import java.util.Random;

public class Yahtzee {
	public static void main(String[] args) {
		Random rand = new Random();
		int max = 6;
		int min = 1;
		int roll = 0;
		int count = 0;
		int tries = 0;
		boolean yahtzee = false;

		while (yahtzee = false) {
			for (int i = 0; i < 5; i++) {
				int outcome = min + rand.nextInt(max - min + 1);
				if (roll == 0) {
					roll = outcome;
					count++;
				} else if (outcome == roll) {
					count++;
				}
			}
			if (count == 5) {
				System.out.println("You got Yahtzee! It took you " + tries + " tries!");
				yahtzee = true;
			} else {
				yahtzee = false;
				tries++;
			}
			count = 0;
		}
	}
}
