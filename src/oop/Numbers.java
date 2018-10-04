package oop;

public class Numbers {

	public Numbers() {
		
	}
	
	public void sayNumber(double num) {
		System.out.println("Number: " + num);
	}
	public void sayNumberPlus2(double number) {
		number += 2;
		System.out.println("Number + 2 = " + number);
	}
	public void saySum(double value1, double value2) {
		double sum = value1 + value2;
		System.out.println(value1 + " + " + value2 + " = " + sum);
	}
	
}