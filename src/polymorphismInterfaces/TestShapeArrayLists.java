package polymorphismInterfaces;

import java.util.Scanner;
import java.util.ArrayList;

public class TestShapeArrayLists {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Shape> shapes = new ArrayList<Shape>();
		
		for (int i = 0; i < 3; i++) {
			shapes.add(new Rectangle(i+2, i+1));
		}
		
		for (int i = 0; i < 4; i++) {
			shapes.add(new Circle(i+3));
		}
		
		double sum = 0;
		double smallestP = shapes.get(0).perimeter();
		for (Shape x : shapes) {
			sum += x.area();
			if (x.perimeter() < smallestP) {
				smallestP = x.perimeter();
			}
		}
		
		System.out.println("Sum of areas: " + sum);
		System.out.println("Smallest perimeter: " + smallestP);
		
		input.close();
	}
}
