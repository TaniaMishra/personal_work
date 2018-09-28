package mathOperators;

import java.util.Scanner;

public class YearsTillVote {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int age = 0;
		int votingAge = 0;
		
		System.out.println("How old are you?");
		age = input.nextInt();
		
		votingAge = 18 - age;
		
		System.out.println("You can vote in " + votingAge + " years!");
		
	}
}
