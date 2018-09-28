package mathOperators;

import java.util.Scanner;

public class LetsPaint {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final double WALL_NUM = 4;
		final double HEIGHT = 8;
		double length = 0;
		double width = 0;
		double gallons = 0.0;
		double wallArea1 = 0.0;
		double wallArea2 = 0.0;
		double area = 0.0;
		
		System.out.println("What is the length of the room? (ft)");
		length = input.nextDouble();
		System.out.println("What is the width of the room? (ft)");
		width = input.nextDouble();
		
		wallArea1 = 2 * (length*HEIGHT);
		wallArea2 = 2 * (width*HEIGHT);
		area = wallArea1 + wallArea2;
		gallons = area / 150.0;
		
		System.out.println("Length: " + length);
		System.out.println("Width: " + width);
		System.out.println("Height: " + HEIGHT);
		System.out.println("Area of Wall Space to be Painted: " + area);
		System.out.println("Number of Gallons Needed: " + Math.ceil(gallons));
	}
}
