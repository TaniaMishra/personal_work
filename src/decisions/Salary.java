package decisions;

import java.util.Scanner;

public class Salary {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("How much money do you make a year?");
		double salary = input.nextDouble();
		
		if (salary < 20000) {
			System.out.println("You are a worker!");
		}
		else {									//could use else if
			if (salary < 40000) {
				System.out.println("You are a manager!");
			}
			else {
				if (salary < 1000000) {
					System.out.println("You are a CEO!");
				}
				else {
					System.out.println("You are the owner!");
				}
			}
		}
		
		input.close();
	}
}
