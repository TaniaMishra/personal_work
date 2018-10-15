package oop;

import java.util.Scanner;

public class TestCircle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Circle roundy = new Circle();
		Circle newCirc = new Circle(2.0);
		
		System.out.println("Current Radius: " + roundy.returnRadius());
		System.out.println("Circumference: " + roundy.circumference());
		System.out.println("Area: " + roundy.area());
		
		System.out.println("What is the new radius?");
		double newRadius = input.nextDouble();
		roundy.changeRadius(newRadius);
		
		System.out.println("Current Radius: " + roundy.returnRadius());
		System.out.println("Circumference: " + roundy.circumference());
		System.out.println("Area: " + roundy.area());
		
		System.out.println("\nCurrent Radius: " + newCirc.returnRadius());
		System.out.println("Circumference: " + newCirc.circumference());
		System.out.println("Area: " + newCirc.area());
		
		input.close();
	}
}
