package oop;

import java.util.Scanner;

public class TestIsoscelesTrapezoid {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		IsoscelesTrapezoid trap = new IsoscelesTrapezoid();
		
		System.out.println("Base 1: " + trap.getBase1());
		System.out.println("Base 2: " + trap.getBase2());
		System.out.println("Height: " + trap.getHeight());
		System.out.println("Leg Length: " + trap.getLeg());
		System.out.println("Perimeter: " + trap.perimeter());
		System.out.println("Area: " + trap.area());
		
		System.out.println("Base 1: ");
		double base1 = input.nextDouble();
		System.out.println("Base 2: ");
		double base2 = input.nextDouble();
		System.out.println("Height: ");
		double height = input.nextDouble();
		System.out.println("Leg Length: ");
		double leg = input.nextDouble();
		
		IsoscelesTrapezoid alt = new IsoscelesTrapezoid(base1, base2, height, leg);

		System.out.println("Perimeter: " + alt.perimeter());
		System.out.println("Area: " + alt.area());
		

		
		input.close();
	}
}
