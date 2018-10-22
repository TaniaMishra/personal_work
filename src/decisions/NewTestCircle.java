package decisions;

import java.util.Scanner;

public class NewTestCircle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Circle circ = new Circle();
		System.out.println("What would you like to do? (enter the corresponding number)");
		System.out.println("1. Display the state of the object.");
		System.out.println("2. Change the radius.");
		System.out.println("3. Display the area.");
		System.out.println("4. Display the circumference.");
		int option = input.nextInt();
		
		switch (option) {
			case 1:
				System.out.println("Radius: " + circ.returnRadius());
				break;
			case 2:
				System.out.println("What do you want the new radius to be?");
				double rad = input.nextDouble();
				circ.changeRadius(rad);
				break;
			case 3:
				System.out.println("Area: " + circ.area());
				break;
			case 4:
				System.out.println("Circumference: " + circ.circumference());
				break;
			default:
				System.out.println("YOU DIDN'T CHOOSE ONE OF THE OPTIONS!");
		}
		
		input.close();
	}
}
