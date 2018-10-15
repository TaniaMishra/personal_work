package oop;

import java.util.Scanner;

public class House {

	public House() {
		
	}
	
	Scanner input = new Scanner(System.in);
	public void paint() {
		System.out.println("What is the length of the wall (ft)?");
		double length = input.nextDouble();
		System.out.println("What is the height of the wall (ft)?");
		double height = input.nextDouble();
		
		double area = length * height; //square feet
		double time = area/200.0; //hours
		time = time * 60.0; //minutes
		
		System.out.println("It will take " + time + " minutes to paint the wall.");
	}
	public void plant(double rows) {
		Scanner input = new Scanner(System.in);
		final double WIDTH = 10.0;
		System.out.println("What is the length of the garden? (ft.)");
		double length = input.nextDouble();

		double timeLinearFt = length/7.5;    //linear feet per hour (15 ft/2 hr = 7.5 ft/2hr)
		double totalTime = timeLinearFt * rows;

		System.out.println("It will take " + totalTime + " hours to plant the garden.");
	}
	public void pool(double radius, double height) {
		double gallons = Math.PI * radius * radius * height;
		double hours = gallons/300;

		System.out.println("It will take " + hours + " hours to fill up the pool.");
	
	}

	
}
