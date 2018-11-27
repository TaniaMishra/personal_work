package arrays;

import java.util.Scanner;
import java.util.Random;

public class RollADie {
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


		while (true) {
			System.out.println("Enter a roll number (-1 to quit): ");
			int userNum = input.nextInt();
			
			if ( userNum == -1) {
				break;
			} else if (userNum > 0 && userNum <= numRolls) {
				System.out.println(rolls[userNum - 1] + " was rolled.");
			} else {
				System.out.println("Incorrect input.");
			}
		}
		System.out.println("Bye-bye!");
	}
}
