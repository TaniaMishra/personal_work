package decisions;

import java.util.Scanner;

public class Largest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int one = input.nextInt();
		System.out.println("Enter another number: ");
		int two = input.nextInt();
		System.out.println("Enter another number: ");
		int three = input.nextInt();
		
		if (one > two && one > three) {
			System.out.println("The largest integer is: " + one);
		}
		else if (two > one && two > three) {
			System.out.println("The largest integer is: " + two);
		}
		else {
			System.out.println("The largest integer is: " + three);
		}
		input.close();
	}

}
