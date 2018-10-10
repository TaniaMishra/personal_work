package oop;

import java.util.Scanner;

public class TestCircle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Circle roundy = new Circle();
		
		System.out.println("Current Radius: " + roundy.returnRadius());
		System.out.println("Circumference: " + roundy.circumference());
		System.out.println("Area: " + roundy.area());
		
		System.out.println("What is the new radius?");
		double newRadius = input.nextDouble();
		roundy.changeRadius(newRadius);
		
		System.out.println("Current Radius: " + roundy.returnRadius());
		System.out.println("Circumference: " + roundy.circumference());
		System.out.println("Area: " + roundy.area());
		
		input.close();
	}
}
