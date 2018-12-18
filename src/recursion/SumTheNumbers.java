package recursion;

import java.util.Scanner;

public class SumTheNumbers {
	public static int sum(int x) {
		int sum = x;
		if (x > 0) {
			return (sum + sum(x-1));
		}
		return 0;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = input.nextInt();
		System.out.println(sum(num));
		input.close();
	}
}
