package mathOperators;

import java.util.Scanner;

public class SumOfAges {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int friend1 = 0;
		int friend2 = 0;
		int friend3 = 0;
		int ages_sum = 0;
		
		System.out.println("What is the age of one of your friends?");
		friend1 = input.nextInt();
		System.out.println("What is the age of another one of your friends?");
		friend2 = input.nextInt();
		System.out.println("What is the age of another one of your friends?");
		friend3 = input.nextInt();

		ages_sum = friend1 + friend2 + friend3;
		
		System.out.println("The sum of your friends' ages is: " + ages_sum);

	}
}
