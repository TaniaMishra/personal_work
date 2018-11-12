package randomNumbers;

import java.util.Scanner;
import java.util.Random;

public class Lottery {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		System.out.println("Winning Lottery Number 1:");
		int win1 = input.nextInt();
		System.out.println("Winning Lottery Number 2:");
		int win2 = input.nextInt();
		System.out.println("Winning Lottery Number 3:");
		int win3 = input.nextInt();
		System.out.println("Winning Lottery Number 4:");
		int win4 = input.nextInt();
		System.out.println("Min Number:");
		int min = input.nextInt();
		while (min < 0) {
			System.out.println("Min Number:");
			min = input.nextInt();
		}
		System.out.println("Max Number:");
		int max = input.nextInt();
		while (max < min) {
			System.out.println("Max Number:");
			max = input.nextInt();
		}
		
		int guess = min + rand.nextInt(max - min + 1);
		int tries = 1;
		
		while (guess != win1 || guess != win2 || guess != win3 || guess != win4) {
			guess = min + rand.nextInt(max - min + 1);
			tries++;
		}
		
		System.out.println("It took " + tries + " try/tries to get a winning number!");
		
		input.close();
	}
}
