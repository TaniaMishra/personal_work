package polymorphismInterfaces;

import java.util.Scanner;

public class TestClassActivities {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//Activity 1
		System.out.println("Enter length: ");
		double length = input.nextDouble();
		System.out.println("Enter width: ");
		double width = input.nextDouble();
		
		ClassActivities rec = new Rectangle(length, width);
		
		System.out.println("Perimeter: " + rec.perimeter());
		System.out.println("Area: " + rec.area());
		
		//Activity 2
		System.out.println("Enter radius: ");
		double radius = input.nextDouble();
		
		ClassActivities cir = new Circle(radius);
		
		System.out.println("Circumference: " + cir.perimeter());
		System.out.println("Area: " + cir.area());
		
		input.close();
	}
}
