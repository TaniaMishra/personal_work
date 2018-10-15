package oop;

import java.util.Scanner;

public class TestCarNew {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		CarNew momsCar = new CarNew();
		CarNew dadsCar = new CarNew();
		CarNew kidsCar = new CarNew();
		
		System.out.println("How many miles did the dad drive?");
		dadsCar.driveCar(input.nextInt());
		System.out.println("How many gallons does the mom's car need?");
		momsCar.fillTank(input.nextInt());
		System.out.println("How many miles did the kid drive?");
		kidsCar.driveCar(input.nextInt());
		System.out.println("How many miles does the dad's car need?");
		dadsCar.fillTank(input.nextInt());
		
		input.close();
	}
}
