package decisions;

import java.util.Scanner;

public class TestTriangle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Triangle bob = new Triangle();
		Triangle jeff = new Triangle(2.0, 2.0, Math.sqrt(8.0));
		
		System.out.println("Current Base: " + bob.getBase());
		System.out.println("Current Height: " + bob.getHeight());
		
		System.out.println("Base of triangle: ");
		bob.changeBase(input.nextDouble());
		System.out.println("Height of triangle: ");
		bob.changeHeight(input.nextDouble());
		System.out.println("With a base of " + bob.getBase() + " and a height of " + bob.getHeight() + "...");
		System.out.println("Hypotenuse: " + bob.hypot());
		System.out.println("Perimeter: " + bob.perimeter(bob.hypot()));
		System.out.println("Area: " + bob.area());
		
		System.out.println("Base of triangle: ");
		jeff.changeBase(input.nextDouble());
		System.out.println("Height of triangle: ");
		jeff.changeHeight(input.nextDouble());
		System.out.println("With a base of " + jeff.getBase() + " and a height of " + jeff.getHeight() + "...");
		System.out.println("Hypotenuse: " + jeff.hypot());
		System.out.println("Perimeter: " + jeff.perimeter(jeff.hypot()));
		System.out.println("Area: " + jeff.area());
		
		input.close();
	}
}
