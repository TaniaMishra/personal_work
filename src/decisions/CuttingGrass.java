package decisions;

import java.util.Scanner;

public class CuttingGrass {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("What is the length of the front yard (ft)");
		double length = input.nextDouble();
		System.out.println("What is the width of the front yard (ft)");
		double width = input.nextDouble();
		double frontArea = length * width;
		double pay = frontArea/100;
		
		System.out.println("Will you cut the backyard? (true or false)");
		boolean backYard = input.nextBoolean();
		if (backYard == true) {
			System.out.println("What is the radius of the front yard (meters)");
			double radius = input.nextDouble();
			double backArea = 3.14 * radius * radius;
			double backPay = backArea/75;
			backPay = backPay * 1.5;
			pay += backPay;
		}
		
		System.out.println("You will be paid $" + pay);
		
		input.close();
	}

}
