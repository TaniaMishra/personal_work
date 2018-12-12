package arrays;

import java.util.Scanner;
import java.util.ArrayList;

public class StudentTestScoresWrapper {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the number of student tests to record:");
		int number = input.nextInt();
		
		ArrayList<Integer> scores = new ArrayList<Integer>();
		
		int highest = 0;
		int highIndex = 0;
		int lowest = 10000000;
		int lowIndex = 0;
		
		for (int i = 0; i < number; i++) {
			System.out.println("Score?");
			scores.add(input.nextInt());
		}
		
		for (int i = 0; i < number; i++) {
			if (scores.get(i) > highest) {
				highest = scores.get(i);
				highIndex = i;
			}
			if (scores.get(i) < lowest) {
				lowest = scores.get(i);
				lowIndex = i;
			}
		}
		
		scores.add(0, scores.get(lowIndex));
		scores.remove(lowIndex+1);
		scores.add(scores.size(), scores.get(highIndex));
		scores.remove(highIndex);
		
		for (int x : scores) {
			System.out.println("Score: " + x);
		}
		
	}
}
