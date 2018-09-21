package inputExamples;

import java.util.Scanner;

public class FortuneTeller {
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		int weight = 0;
		int age = 0;
		int num = 0;
		System.out.print("Enter your weight: ");
		weight = userInput.nextInt();
		System.out.print("Enter your age: ");
		age = userInput.nextInt();
		System.out.print("Enter your lucky number: ");
		num = userInput.nextInt();
		System.out.println("In the future...\nI see...\n" + num + " years from now...\nYou will reside number " + age + weight + "\nat the old folks home.");
	}
}
