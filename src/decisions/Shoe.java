package decisions;

import java.util.Scanner;

public class Shoe {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("What is your height?");
		double height = input.nextDouble();
		System.out.println("What is your shoe size?");
		double shoe = input.nextDouble();
		double sum = shoe + height;
		System.out.println(sum >= 26);
		
		
		input.close();

	}
}
