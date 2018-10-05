package oop;

public class Numbers {

	public Numbers() {
		
	}
	
	public void sayNumber(double num) {
		System.out.println("Number: " + num);
	}
	public void sayNumberPlus2(double number) {
		number += 2;
		System.out.println("Your number + 2 = " + number);
	}
	public void saySum(double value1, double value2) {
		double sum = value1 + value2;
		System.out.println(value1 + " + " + value2 + " = " + sum);
	}
	public double returnSquare(double number) {
		double value = number * number;
		return value;
	}
	public double returnArea(double length, double width) {
		double area = length * width;
		return area;
	}
	public int returnRoundUp(double number) {
		number ++;
		int value = (int)number;
		return value;
		//or use: int value = Math.ceil(number); and return value;
	}
	
}