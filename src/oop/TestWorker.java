package oop;

import java.util.Scanner;

public class TestWorker {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Worker bob = new Worker();
		Worker jeff = new Worker(5, 16.0);
		
		System.out.println("Hours Worked: " + bob.getHours());
		System.out.println("Hourly Pay: $" + bob.getPay());
		System.out.print("Hours Worked Now: ");
		bob.changeHours(input.nextInt());
		System.out.print("New Hourly Pay: ");
		bob.changePay(input.nextDouble());
		System.out.println("Raise: ");
		bob.raise(input.nextDouble());
		System.out.println("With " + bob.getHours() + " hours worked and earning $" + bob.getPay() + ", (with the raise) you will get a pay check of $" + bob.payCheck());
		
		System.out.println("Hours Worked: " + jeff.getHours());
		System.out.println("Hourly Pay: $" + jeff.getPay());
	}

}
