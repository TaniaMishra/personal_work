package oop;

import java.util.Scanner;

public class Room {
	Scanner input = new Scanner(System.in);
	
	public Room() {
		
	}
	
	public void area() {
		System.out.println("What is the length of the wall (ft)?");
		double length = input.nextDouble();
		System.out.println("What is the height of the wall (ft)?");
		double height = input.nextDouble();
		
		double area = length * height;
		
		System.out.println("The area of the wall is " + area + " squared feet.");
	}
	public void areaWithDoor() {
		System.out.println("What is the length of the wall (ft)?");
		double wallLength = input.nextDouble();
		System.out.println("What is the height of the wall (ft)?");
		double wallHeight = input.nextDouble();
		System.out.println("What is the length of the door (ft)?");
		double doorLength = input.nextDouble();
		System.out.println("What is the height of the door (ft)?");
		double doorHeight = input.nextDouble();
		
		double wallArea = wallLength * wallHeight;
		double doorArea = doorLength * doorHeight;
		double totalArea = wallArea - doorArea;
		
		System.out.println("The area of the wall (without the door) is " + totalArea + " squared feet.");
	}
}
