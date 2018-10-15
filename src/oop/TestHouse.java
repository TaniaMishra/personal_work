package oop;

import java.util.Scanner;

public class TestHouse {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		House john = new House();
		
		john.paint();
		
		System.out.println("How many rows are in the garden?");
		double rows = input.nextDouble();
		john.plant(rows);

		System.out.println("What is the radius of the pool (ft)?");
		double radius = input.nextDouble();
		System.out.println("What is the height of the pool (ft)?");
		double height = input.nextDouble();
		john.pool(radius, height);
	}
}
