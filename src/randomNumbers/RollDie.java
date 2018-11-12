package randomNumbers;

import java.util.Scanner;
import java.util.Random;

public class RollDie {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		System.out.println("Enter the number of sides on the die:");
		int sides = input.nextInt();
		int min = 1;
		//make sure sides is greater than min - if not, keep asking user
		boolean goodValue = false;
		while(goodValue == false) {
			if (sides > min) {
				goodValue = true;
			}
			else {
				System.out.println("Incorrect value. Try again.");
				System.out.println("Enter the number of sides on the die:");
				sides = input.nextInt();
				goodValue = false;
			}
		}
		
		System.out.println("Enter the number of rolls:");
		int rolls = input.nextInt();
		//make sure number of rolls is positive - if not, keep asking user
		goodValue = false;
		while (goodValue == false) {
			if (rolls > 0) {
				goodValue = true;
			}
			else {
				System.out.println("Incorrect value. Try again.");
				System.out.println("Enter the number of rolls:");
				rolls = input.nextInt();
				goodValue = false;
			}
		}
		
		for (int i = 1; i <= rolls; i++) {
			int number = min + rand.nextInt(sides - min + 1);
			System.out.println("Roll " + i + ": " + number);
		}
		
		input.close();
	}
}
