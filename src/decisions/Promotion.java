package decisions;

import java.util.Scanner;

public class Promotion {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("How many years of experience do you have?");
		int experience = input.nextInt();
		System.out.println("Answer the following statemets with true or false.");
		System.out.println("You are a sales person.");
		boolean salesPerson = input.nextBoolean();
		if (salesPerson == false) {
			System.out.println("You are a delivery driver.");
			boolean deliveryDriver = input.nextBoolean();
			if (deliveryDriver == false) {
				System.out.println("You are not eligible for a promotion.");
			}
			else {
				if (experience >= 5) {
					System.out.println("You are eligible for a promotion!");
				}
				else {
					System.out.println("You are not eligible for a promotion.");
				}
			}
		}
		else {
			if (experience >= 3) {
				System.out.println("You are eligible for a promotion!");
			}
			else {
				System.out.println("You are not eligible for a promotion.");
			}
		}
		
		
		
		input.close();
	}

}
