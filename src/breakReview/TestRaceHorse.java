package breakReview;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class TestRaceHorse {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.println("Enter number of horses:");
		int num = input.nextInt();
		
		ArrayList<RaceHorse> horses = new ArrayList<RaceHorse>();
		for (int i = 0; i < num; i++) {
			System.out.println("Name: ");
			input.next();
			String name = input.nextLine();
			System.out.println("Total number of races run: ");
			int races = input.nextInt();
			System.out.println("Total number of miles run: ");
			int miles = input.nextInt();
			horses.add(new RaceHorse(name, races, miles));
		}
		
		for (int i = 0; i < 50; i++) {		//50 races in a season
			int index = rand.nextInt(horses.size()-1);
			int distance = 1 + rand.nextInt(5);
			horses.get(index).race(distance);
		}
		
		int greatest = 0;
		for (RaceHorse x : horses) {
			System.out.println(x.getName());
			if (x.getNumMiles() > greatest) {
				greatest = x.getNumMiles();
			}
		}
		
		System.out.println("The greatest distance raced is " + greatest + " miles.");
		
		input.close();
	}
}
