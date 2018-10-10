package oop;

import java.util.Scanner;

public class TestRightTriangle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		RightTriangle bob = new RightTriangle();
		RightTriangle jeff = new RightTriangle(4.0, 2.5);
		
		System.out.println("Base of triangle: ");
		bob.changeBase(input.nextDouble());
		
		
	}
}
