package decisions;

import java.util.Scanner;

public class TestModifiedCar {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ModifiedCar momsCar = new ModifiedCar();
		ModifiedCar dadsCar = new ModifiedCar();
		ModifiedCar kidsCar = new ModifiedCar();
		
		System.out.println("How many miles did the dad drive?");
		dadsCar.driveCar(input.nextInt());
		System.out.println("How many gallons does the mom's car need?");
		momsCar.fillTank(input.nextInt());
		System.out.println("How many miles did the kid drive?");
		kidsCar.driveCar(input.nextInt());
		System.out.println("How many gallons does the dad's car need?");
		dadsCar.fillTank(input.nextInt());
		
		input.close();
	}
}
