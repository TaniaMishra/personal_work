package oop;

import java.util.Scanner;

public class ShapeTestClass {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is the length of the rectangle?");
		double length = input.nextDouble();
		System.out.println("What is the width of the rectangle?");
		double width = input.nextDouble();
		System.out.println("What is the radius of the circle?");
		double radius = input.nextDouble();
		System.out.println("What is the base of the right triangle?");
		double base = input.nextDouble();
		System.out.println("What is the height of the right triangle?");
		double heightTri = input.nextDouble();
		System.out.println("What is the base 1 of the isoceles trapezoid?");
		double base1 = input.nextDouble();
		System.out.println("What is the base 2 of the isoceles trapezoid?");
		double base2 = input.nextDouble();
		System.out.println("What is the height of the isoceles trapezoid?");
		double heightTrap = input.nextDouble();
		System.out.println("What is the leg of the isoceles trapezoid?");
		double leg = input.nextDouble();
		
		
		Rectangle rec = new Rectangle(length, width);
		Circle circ = new Circle(radius);
		RightTriangle tri = new RightTriangle(base, heightTri);
		IsoscelesTrapezoid trap = new IsoscelesTrapezoid(base1, base2, heightTrap, leg);
		
		double hypot = tri.hypot();
		
		System.out.println("Perimeter of Rectangle: " + rec.perimeter());
		System.out.println("Circumference of Circle: " + circ.circumference());
		System.out.println("Perimeter of Right Triangle: " + tri.perimeter(hypot));
		System.out.println("Perimeter of Isoceles Trapezoid: " + trap.perimeter());
		
		System.out.println("Area of Rectangle: " + rec.area());
		System.out.println("Area of Circle: " + circ.area());
		System.out.println("Area of Right Triangle: " + tri.area());
		System.out.println("Area of Isoceles Trapezoid: " + trap.area());
		
		
		input.close();
	}
}
