package arrays;

import java.util.Scanner;
import java.util.ArrayList;

public class ForEachActivities {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("How many students are there?");
		int students = input.nextInt();
		int[] ages = new int[students];
		for (int i = 0; i < ages.length; i++) {
			System.out.println("Age?");
			ages[i] = input.nextInt();
		}
		double average = 0;
		for (int x : ages) {
			average += x;
		}
		average = average/ages.length;
		System.out.println("Average age: " + average);
		
		
		System.out.println("Number of employees:");
		int employees = input.nextInt();
		ArrayList<Double> wages = new ArrayList<Double>();
		double highest = 0;
		for (int i = 0; i < employees; i++) {
			System.out.println("Wage?");
			wages.add(input.nextDouble());
		}
		for (double x : wages) {
			if (x > highest) {
				highest = x;
			}
		}
		System.out.println("The highest wage is $" + highest);
		
		
		ArrayList<Circle> circs = new ArrayList<Circle>();
		for (int i = 0; i < 10; i++) {
			System.out.println("Enter the radius:");
			circs.add(new Circle(input.nextDouble()));
		}
		for (Circle x : circs) {
			System.out.println("Area: " + x.area());
		}
		
		
		input.close();
	}
}
