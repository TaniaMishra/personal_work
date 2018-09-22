package mathOperators;

import java.util.Scanner;

public class CircleArea {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double radius = 0.0;
		double pi = 3.14159;
		double area = 0.0;
		
		System.out.println("What is the radius of the circle? (inches)");
		radius = input.nextDouble();
		
		area = pi * (radius*radius);
		
		System.out.println("The area of the circle is " + area + " squared inches.");
		
	}
}
