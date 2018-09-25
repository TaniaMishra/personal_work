package mathOperators;

import java.util.Scanner;

public class BussesVans {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int total_people = 0;
		int busses = 0;
		int people_left = 0;
		
		System.out.println("How many people need to be transported?");
		total_people = input.nextInt();
		
		busses = total_people / 35;
		people_left = total_people % 35;
		
		System.out.println("Number of people in the group: " + total_people);
		System.out.println("Number of busses: " + busses);
		System.out.println("Number of people left over: " + people_left);

	}
}
