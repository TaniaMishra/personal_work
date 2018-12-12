package arrays;

import java.util.Scanner;
import java.util.Random;

public class TestRectangle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random rand = new Random(5);
		
		int min = 10;
		int max = 56;
		
		Rectangle[] rec = new Rectangle[10];
		
		for (int i = 0; i < rec.length; i++) {
			int length = min + rand.nextInt(max-min+1);
			int width = min + rand.nextInt(max-min+1);
			rec[i] = new Rectangle(length, width);
		}
		
		for (int i = 0; i < rec.length; i++) {
			System.out.println("Rectangle at element " + i + ":");
			System.out.println("Length: " + rec[i].getLength());
			System.out.println("Width: " + rec[i].getWidth());
			System.out.println("Area: " + rec[i].area());
		}
		
		int smallest = rec[0].area();
		int smallestElement = 0;
		for (int i = 0; i < rec.length; i++) {
			int area = rec[i].area();
			if (area < smallest) {
				smallest = area;
				smallestElement = i;
			}
		}
		System.out.println("The rectangle at element " + smallestElement + " has the smallest area.");

		//Move the smallest element to the first index of the array
/*		for (int i = rec.length - smallestElement; i >= 0; i++) {
			if (i + 1 > smallestElement) {
				rec[0] = rec[i];
			}
			else {
				rec[i+1] = rec[i];
			}
		}
		
		for (int i = 0; i < rec.length; i++) {
			System.out.println("Area: " + rec[i].area());
		}
*/		
		

		input.close();
	}
}
