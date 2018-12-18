package recursion;

import java.util.Scanner;

public class ReverseOrder {
	public static void reverse(int x) {
		if (x > 0) {
			int num = x % 10;
			System.out.print(num);
			reverse(x/10);
		}
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = input.nextInt();
		reverse(num);
		input.close();
	}
}
