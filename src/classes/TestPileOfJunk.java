package classes;

import java.util.Scanner;

public class TestPileOfJunk {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		PileOfJunk junk = new PileOfJunk();
		
		System.out.println("Enter a number:");
		int x = input.nextInt();
		System.out.println("Enter a number:");
		int y = input.nextInt();
		
		System.out.println("Sum: " + junk.sum(x, y));
		junk.setRandNum(x);
		
		input.close();
	}

}
