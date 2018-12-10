package arrays;

import java.util.Scanner;
import java.util.ArrayList;

public class StudentsForEachLoop {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Number of Students:");
		int number = input.nextInt();
		
		ArrayList<Student> students = new ArrayList<Student>();
		
		for (int i = 0; i < number; i++) {
			System.out.println("Name:");
			String name = input.nextLine();
			System.out.println("Score:");
			int score = input.nextInt();
			
			students.add(new Student(name, score));
		}
		
		System.out.println("Enter a letter:");
		String letter = input.next();
		
		for (Student x : students) {
			if (x.returnName().charAt(0) == letter.charAt(0)) {
				System.out.println("Name: " + x.returnName() + "   Score: " + x.returnScore());
			}
		}
		
		System.out.println("Enter a score:");
		int score = input.nextInt();
		
		for (Student x : students) {
			if (x.returnScore() == score) {
				
			}
		}

	}
}
