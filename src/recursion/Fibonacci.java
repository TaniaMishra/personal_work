package recursion;

import java.util.Scanner;

public class Fibonacci {
	public static void sequence(int n) {
		if (n > 0) {
			int next = 0;
			int one = 1;;
			int two = 1;
			int now = 0;
			for (int i = 0; i < n; i++) {
				if (i == 0) {
					now = 1;
					next = i+1;
					one = 1;
				}
				else if (i == 1) {
					now = next;
					next = i+1;
					two = 2;
				}
				else {
					now = next;
					next = one + two;
					one = two;
					two = now;
				}
			}
			System.out.println(now);
		}
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number in the Fibonacci sequence:");
		int num = input.nextInt();
		sequence(num);
		input.close();
	}
}
