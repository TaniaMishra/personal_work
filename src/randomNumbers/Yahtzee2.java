package randomNumbers;

import java.util.Random;

public class Yahtzee2 {
	public static void main(String[] args) {
		Random rand = new Random();
		int max = 6;
		int min = 1;
		int roll = 0;
		int count = 0;
		int tries = 0;
		int minTries = 10000000;
		boolean yahtzee = false;

		for (int k = 0; k < 100; k++) {
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
					yahtzee = true;
				}
				else {
					yahtzee = false;
					tries++;
				}
				count = 0;
			}
			if (tries < minTries) {
				minTries = tries;
			}
			yahtzee = false;
		}
		
		System.out.println("Minimum number of rolls it took to get yahtzee: " + minTries);
	}

}
