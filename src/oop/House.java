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
	
}
