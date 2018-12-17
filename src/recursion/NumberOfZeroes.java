package recursion;

import java.util.Scanner;

public class NumberOfZeroes {
	public static int numZeroes(int x) {
		if (x > 0) {
			int last = x % 10;
			if (last == 0) {
				return (1 + numZeroes(x/10));
			}
			else {
				return numZeroes(x/10);
			}
		}
		return 0;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = input.nextInt();
		System.out.println(numZeroes(num));
		input.close();
	}
}
