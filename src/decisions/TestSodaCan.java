package decisions;

import java.util.Scanner;

public class TestSodaCan {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("What is the height of the can?");
		double height = input.nextDouble();
		System.out.println("What is the radius of the can?");
		double radius = input.nextDouble();
		
		SodaCan can = new SodaCan(radius, height);
		
		double surfaceArea = can.surfaceArea();
		double volume = can.volume();
		double cost = can.cost();
		
		System.out.println("Surface Area: " + surfaceArea + " squared inches.");
		System.out.println("Volume: " + volume + " cubic inches.");
		System.out.println("Cost for the Soda Can: $" + cost);

		input.close();
	}
}
