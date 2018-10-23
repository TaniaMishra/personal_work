package decisions;

import java.util.Scanner;

import oop.Rectangle;

public class NewTestRectangle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Rectangle rec = new Rectangle();
		System.out.println("What would you like to do? (Enter the corresponding number)");
		System.out.println("1. Display the state of the object.");
		System.out.println("2. Change the length.");
		System.out.println("3. Change the width.");
		System.out.println("4. Display the area.");
		System.out.println("5. Display the perimeter.");
		int option = input.nextInt();
		
		switch (option) {
			case 1:
				System.out.println("Length: " + rec.returnLength());
				System.out.println("Width: " + rec.returnWidth());
				break;
			case 2:
				System.out.println("What do you want to change the length to?");
				double length = input.nextDouble();
				rec.changeLength(length);
				break;
			case 3:
				System.out.println("What do you want to change the width to?");
				double width = input.nextDouble();
				rec.changeWidth(width);
				break;
			case 4:
				System.out.println("Area: " + rec.area());
				break;
			case 5:
				System.out.println("Perimeter: " + rec.perimeter());
		}

	}
}
