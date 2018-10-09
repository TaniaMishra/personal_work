package oop;

import java.util.Scanner;

public class Sandbox {
	public Sandbox() {

	}
	
	Scanner input = new Scanner(System.in);
	public void version1() {
		System.out.println("What is the length of the sandbox (ft.)?");
		Double length = input.nextDouble();
		System.out.println("What is the width of the sandbox (ft.)?");
		Double width = input.nextDouble();
		System.out.println("What is the depth of the sandbox (ft.)?");
		Double depth = input.nextDouble();
		System.out.println("How many cubic feet of sand can you transport in an hour?");
		Double speed = input.nextDouble();
		
		Double volume = length * width * depth;
		Double time = volume/speed;

		System.out.println("You will need " + time + " hours to fill the sandbox.");
	}
	public void version2(double length, double width, double depth, double speed) {
		Double volume = length * width * depth;
		Double time = volume/speed;

		System.out.println("You will need " + time + " hours to fill the sandbox.");
	}
	public double version3(double length, double width, double depth, double speed) {
		Double volume = length * width * depth;
		Double time = volume/speed;
		
		return time;
	}
}
