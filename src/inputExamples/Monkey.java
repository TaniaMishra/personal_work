package inputExamples;

import java.util.Scanner;

public class Monkey {

	public static void main(String[] args) {
		double height;
		Scanner input = new Scanner(System.in);
		System.out.println("What is the height of an adult monkey? Just type the number (in feet).");
		height = input.nextDouble();
		System.out.println("The height of an adult monkey is " + height + " feet.");
	}

}
