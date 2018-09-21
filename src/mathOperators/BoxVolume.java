package mathOperators;

import java.util.Scanner;

public class BoxVolume {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double length = 0.0;
		double width = 0.0;
		double height = 0.0;
		double volume = 0.0;
		
		System.out.println("What is the length of your box? (inches)");
		length = input.nextDouble();
		System.out.println("What is the width of your box? (inches)");
		width = input.nextDouble();
		System.out.println("What is the height of your box? (inches)");
		height = input.nextDouble();
		
		volume = length * width * height;
		
		System.out.println("The volum of your box is " + volume + " cubed inches.");
	}
}
