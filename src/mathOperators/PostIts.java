package mathOperators;

import java.util.Scanner;

public class PostIts {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double post_it = 3.0 * 3.0;
		double surface_area = 0.0;
		double width = 0.0;
		double length = 0.0;
		double number = 0.0;
		
		System.out.println("What is the length of your rectangular surface? (inches)");
		length = input.nextDouble();
		System.out.println("What is the width of your rectangular surface? (inches)");
		width = input.nextDouble();
		
		surface_area = length * width;
		number = surface_area / post_it;
		
		System.out.println("You would need " + number + " of post-its to cover the surface.");
		
	}
}
