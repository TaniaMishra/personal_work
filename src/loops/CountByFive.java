package loops;

import java.util.Scanner;

public class CountByFive {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("What value should I stop counting at?");
		int end = input.nextInt();
		int multiples = 5;
		
		while (multiples < end) {
			System.out.println(multiples);
			multiples += 5;
		}
		
		input.close();
	}
}
