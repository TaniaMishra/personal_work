package inputExamples;

import java.util.Scanner;

public class Monkey {

	public static void main(String[] args) {
		double height = -999.0;		//made it an impossible number so that it is easier to debug.
		Scanner userInput = new Scanner(System.in);
		System.out.println("What is the height of an adult monkey? Just type the number (in feet).");
		height = userInput.nextDouble();
		System.out.println("The height of an adult monkey is " + height + " feet.");
	}

}
