package decisions;

import java.util.Scanner;

public class Age {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("What is your age?");
		int age = input.nextInt();
		System.out.println("Are you sixteen? " + (age == 16));
		
		input.close();
	}

}
