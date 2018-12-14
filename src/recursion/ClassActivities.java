package recursion;

import java.util.Scanner;

public class ClassActivities {
	public static int sumOfNum(int x) {
		if (x > 0) {
			return (x + sumOfNum(x-1));
		}
		return 0;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = input.nextInt();
		System.out.println(sumOfNum(num));
		input.close();
	}
}
