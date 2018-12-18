package recursion;

import java.util.Scanner;

public class ProductOfDigits {
	public static int multiply(int x) {
		if (x > 0) {
			int last = x % 10;
			return (last * multiply(x/10));
		}
		return 1;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = input.nextInt();
		System.out.println(multiply(num));
		input.close();
	}
}
