package oop;

import java.util.Scanner;

public class TestRectangle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Rectangle pointy = new Rectangle();
		Rectangle newRec = new Rectangle(2.0, 6.0);
		
		System.out.println("Current Length: " + pointy.returnLength());
		System.out.println("Current Width: " + pointy.returnWidth());
		System.out.println("Perimeter of Rectangle: " + pointy.perimeter());
		System.out.println("Area of Rectangle: " + pointy.area());
		
		System.out.println("What is the new length of the rectangle?");
		pointy.changeLength(input.nextDouble());
		System.out.println("What is the new width of the rectangle?");
		pointy.changeWidth(input.nextDouble());
		
		System.out.println("Current Length: " + pointy.returnLength());
		System.out.println("Current Width: " + pointy.returnWidth());
		System.out.println("Perimeter of Rectangle: " + pointy.perimeter());
		System.out.println("Area of Rectangle: " + pointy.area());
		
		System.out.println("\nCurrent Length: " + newRec.returnLength());
		System.out.println("Current Width: " + newRec.returnWidth());
		System.out.println("Perimeter of Rectangle: " + newRec.perimeter());
		System.out.println("Area of Rectangle: " + newRec.area());
		
		input.close();
	}
}
