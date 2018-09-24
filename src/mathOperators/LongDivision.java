package mathOperators;

import java.util.Scanner;

public class LongDivision {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int dividend = 0;
		int divisor = 0;
		int answer = 0;
		int remainder = 0;
		
		System.out.print("What is the dividend? ");
		dividend = input.nextInt();
		System.out.print("What is the divisor? ");
		divisor = input.nextInt();
		
		answer = dividend / divisor;
		remainder = dividend % divisor;
		
		System.out.println("Result: " + answer + "r" + remainder);
	}
}
