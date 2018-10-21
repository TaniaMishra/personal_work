package decisions;

import java.util.Scanner;

public class Temperature {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("What is the temperature outside? (in degrees Farenheit)");
		int temp = input.nextInt();
		
		if (temp > 83) {
			System.out.println("The perfect temperature for swimming!");
		}
		else {
			if (temp > 74) {
				System.out.println("A great temperature for playing a nice game of tennis!");
			}
			else {
				if (temp > 35) {
					System.out.println("With this temperature, playing golf is inevitable!");
				}
				else {
					if (temp > -10) {
						System.out.println("Snow shoeing is the best sport for this temperature!");
					}
					else {
						System.out.println("It's too cold to do anything. Snuggle in!");
					}
				}
			}
		}
		input.close();
	}
}
