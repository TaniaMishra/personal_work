package recursion;

import java.util.Scanner;

public class SumOfTheOdd {
	public static int sumOdd(int x) {
		if (x > 0) {
			return (x + sumOdd(x-2));
		}
		else {
			return 0;
		}
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an odd number:");
		int num = input.nextInt();
		while ((num % 2) == 0) {
			System.out.println("Try again. Enter an odd number:");
			num = input.nextInt();
		}
		System.out.println(sumOdd(num));
		input.close();
	}
}
