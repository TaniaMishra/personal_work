package decisions;

import java.util.Scanner;

public class PetsGarage {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("How many pets do you have?");
		double pets = input.nextDouble();
		System.out.println("How many cars fit in your garage?");
		double cars = input.nextDouble();
		
		System.out.println(pets >= 5 && cars > 3);
	}

}
