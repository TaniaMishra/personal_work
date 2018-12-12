package arrays;

import java.util.Scanner;
import java.util.Random;

public class RandomNumbers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		
		int[] numbers = new int[10000];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = 1 + rand.nextInt(100);
		}
		
		System.out.print("Enter a number between 1 and 100: ");
		int userNum = input.nextInt();
		
		while (userNum != -1) {
			int counter = 0;
			for (int i = 0; i < numbers.length; i++) {
				if (userNum == numbers[i]) {
					counter++;
				}
			}
		
			System.out.println(userNum + " shows up in " + counter + " element(s) of the array!");
			
			System.out.print("Enter a number between 1 and 100 (-1 to quit): ");
			userNum = input.nextInt();
		}
		
		input.close();
	}
}
