package oop;

//import java.util.Scanner;

public class TestNumbers {
	public static void main(String[] args) {
		//Scanner input = new Scanner(System.in);
		Numbers bob = new Numbers();
		
		bob.sayNumber(5.5);
		
		bob.sayNumberPlus2(5.5);
		
		bob.saySum(2.1, 3.4);
		
		double value = bob.returnSquare(3.0);
		System.out.println("3.0 squared = " + value);
		
		double area = bob.returnArea(12.0, 12.0);
		System.out.println("Area: " + area);
		
		double number = bob.returnRoundUp(4.5);
		System.out.println("Round Up: " + number);
		
		
	}
}
