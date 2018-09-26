package mathOperators;

import java.util.Scanner;

public class CuttingGrass {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double length = 0.0;
		double width = 0.0;
		double radius = 0.0;
		double areaLawn = 0.0;
		double areaFountain = 0.0;
		double money = 0.0;
		
		System.out.println("What is the length of the lawn?");
		length = input.nextDouble();
		System.out.println("What is the width of the lawn?");
		width = input.nextDouble();
		System.out.println("What is the radius of the fountain?");
		radius = input.nextDouble();

		areaFountain = Math.PI * (radius*radius);
		areaLawn = (length*width) - areaFountain;
		money = (areaLawn/100.0) * 1.25;
		
		System.out.println("Amount Owed: $" + money);
	}
}
