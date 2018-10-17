package decisions;

import java.util.Scanner;

public class HeightShoe {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("What is your height? (in inches)");
		double height = input.nextDouble();
		System.out.println("What is your shoe size?");
		double shoe = input.nextDouble();
		
		System.out.println("Is your height less than 62 in and your shoe size greater than 9?");
		System.out.println(height < 62 && shoe > 9);

	}
}
