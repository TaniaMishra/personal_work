package arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Algebra2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		ArrayList<Student> algebra = new ArrayList<Student>();
		
		System.out.println("Number of students:");
		int students = input.nextInt();
		
		int highest = -1;
		int highIndex = 0;
		int lowest = 100000;
		int lowIndex = 0;
		
		for (int i = 0; i < students; i++) {
			input.nextLine();

			System.out.println("Name:");
			String name = input.nextLine();
			System.out.println("Score:");
			int score = input.nextInt();
			algebra.add(new Student(name, score));
			
			if (algebra.get(i).returnScore() > highest) {
				highest = algebra.get(i).returnScore();
				highIndex = i;
			}
			if (algebra.get(i).returnScore() < lowest) {
				lowest = algebra.get(i).returnScore();
				lowIndex = i;
			}
			
		}
		
		for (int i = 0; i < algebra.size(); i++) {
			System.out.println("Name: " + algebra.get(i).returnName());
			System.out.println("Score: " + algebra.get(i).returnScore());
		}
		
		System.out.println("Student with the highest test score: " + algebra.get(highIndex).returnName());
		System.out.println("Student with the lowest test score: " + algebra.get(lowIndex).returnName());
		
		input.close();
	}

}
