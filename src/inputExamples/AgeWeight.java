package inputExamples;

import java.util.Scanner;

public class AgeWeight {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int age = 0;
		double weight = 0.0;
		System.out.println("How old are you?");
		age = input.nextInt();
		System.out.println("How much do you weigh? (in pounds)");
		weight = input.nextDouble();
		System.out.println("You are " + age + " years old and you weigh " + weight + " pounds.");
	}
}
