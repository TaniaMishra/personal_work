package recursion;

import java.util.Scanner;

public class TwoNumSum {
	public static void sum(int x, int y) {
		if (x > 0 && y > 0) {
			int xLast = x % 10;
			int yLast = y % 10;
			int sum = xLast + yLast;
			System.out.print(sum + "   ");
			sum(x/10, y/10);
		}
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int digits = 1;
		int num1;
		int digits2 = 1;
		int num2;
		do {
			System.out.println("Enter a number:");
			num1 = input.nextInt();
			int test = num1/10;
			while (test > 0) {
				test = test/10;
				digits++;
			}
			System.out.println("Enter a number:");
			num2 = input.nextInt();
			int test2 = num2/10;
			while (test2 > 0) {
				test2 = test2/10;
				digits2++;
			}
		}
		while (digits != digits2);
		
		sum(num1, num2);
		input.close();
	}
}
