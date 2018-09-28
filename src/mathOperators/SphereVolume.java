package mathOperators;

import java.util.Scanner;

public class SphereVolume {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double radius = 0.0;
		double volume = 0.0;
		
		System.out.println("What is the radius of your sphere? (inches)");
		radius = input.nextDouble();
		
		volume = (4.0/3.0) * Math.PI * (radius*radius*radius);
		System.out.println("The volume of your sphere is " + volume + " cubic inches.");
	}
}
