package polymorphismInterfaces;

import java.util.Scanner;

public class TestShape {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the radius:");
		double r = input.nextDouble();
		System.out.println("Enter the length:");
		double l = input.nextDouble();
		System.out.println("Enter the width:");
		double w = input.nextDouble();
		
		Shape rec = new Rectangle(l, w);
		Shape cir = new Circle(r);
		
		System.out.println("Area of Rectangle: " + rec.area());
		System.out.println("Perimeter of Rectangle: " + rec.perimeter());
		System.out.println("Area of Circle: " + cir.area());
		System.out.println("Circumference of Circle: " + cir.perimeter());
		
		input.close();
	}
}
