package mathOperators;

import java.util.Scanner;

public class WallArea {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double width = 0.0;
		double area = 0.0;
		
		System.out.println("What is the width of the wall? (in feet)");
		width = input.nextDouble();
		
		area = width * 8.0;
		
		System.out.println("The wall's area is " + area + " squared feet.");
	}
}
