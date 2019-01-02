package searching;

import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class SequentialActivities {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random rand = new Random(5);
		ArrayList<Integer> scores = new ArrayList<Integer>();
		for (int i = 0; i < 1000; i++) {
			int score = 400 + rand.nextInt(1201);
			scores.add(score);
		}
		System.out.print("Enter a SAT Score: ");
		int sat = input.nextInt();
		boolean there = false;
		for (Integer x : scores) {
			if (x == sat) {
				there = true;
				break;
			}
		}
		System.out.println("Is " + sat + " in the ArrayList?   " + there);


		
		int[] numbers = new int[100];
		for (int i = 0; i < numbers.length; i++) {
			int score = rand.nextInt(500);
			numbers[i] = score;
		}
		System.out.print("Enter a Number: ");
		int userNum = input.nextInt();
		int counter = 0;
		for (int x : numbers) {
			if (x == userNum) {
				counter++;
			}
		}
		System.out.println(userNum + " is in the array " + counter + " times.");

		
		
		ArrayList<Rectangle> recs = new ArrayList<Rectangle>();
		for (int i = 0; i < 100; i++) {
			int length = rand.nextInt(500);
			int width = rand.nextInt(500);
			recs.add(new Rectangle(length, width));
		}
		int width10 = 0;
		for (Rectangle x : recs) {
			if (Math.abs(x.getWidth()-10) < 0.001) {
				width10++;
			}
		}
		System.out.println(width10 + " rectangles have a width of 10.");
		
		
		
		input.close();
	}
}
