package decisions;

import java.util.Scanner;

public class PostIt {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final int POST_IT_AREA = 3*3;
		System.out.println("Do you want to calculate this in inches or feet? (true = inches, false = feet)");
		boolean inchesFeet = input.nextBoolean();
		
		if (inchesFeet == true) {
			System.out.println("What is the length of the rectangle (inches)?");
			double length = input.nextDouble();
			System.out.println("What is the width of the rectangle (inches)?");
			double width = input.nextDouble();
			double area = length * width;
			double postIts = area/POST_IT_AREA;
			System.out.println("You need " + postIts + " post its to cover the rectangle.");
		}
		else {
			System.out.println("What is the length of the rectangle (feet)?");
			double length = input.nextDouble();
			length *= 12;
			System.out.println("What is the width of the rectangle (feet)?");
			double width = input.nextDouble();
			width *= 12;
			double area = length * width;
			double postIts = area/POST_IT_AREA;
			System.out.println("You need " + postIts + " post its to cover the rectangle.");
		}
		
		
		input.close();
	}
}
