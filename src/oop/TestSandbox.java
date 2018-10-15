package oop;

import java.util.Scanner;

public class TestSandbox {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Sandbox bob = new Sandbox();
				
		bob.version1();

		System.out.println("What is the length of the sandbox (ft.)?");
		double length = input.nextDouble();
		System.out.println("What is the width of the sandbox (ft.)?");
		double width = input.nextDouble();
		System.out.println("What is the depth of the sandbox (ft.)?");
		double depth = input.nextDouble();
		System.out.println("How many cubic feet of sand can you transport in an hour?");
		double speed = input.nextDouble();

		bob.version2(length, width, depth, speed);

		double time = bob.version3(length, width, depth, speed);
		System.out.println("You will need " + time + " hours to fill the sandbox.");
		
		input.close();

	}

}
