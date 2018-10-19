package decisions;

import java.util.Scanner;
import oop.Rectangle;

public class Shape {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Would like to find the area of a circle (answer true) or rectangle (answer false)?");
		boolean cirRec = input.nextBoolean();
		
		if (cirRec == true) {
			System.out.println("What is the radius of the circle?");
			double radius = input.nextDouble();
			Circle circ = new Circle(radius);
			double area = circ.area();
			System.out.println("Area: " + area);
		}
		else {
			System.out.println("What is the length of the rectangle?");
			double length = input.nextDouble();
			System.out.println("What is the width of the rectangle?");
			double width = input.nextDouble();
			oop.Rectangle rec = new Rectangle(length, width);
			double area = rec.area();
			System.out.println("Area: " + area);
		}
		input.close();
	}
}
