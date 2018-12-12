package arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class TestStudent {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		ArrayList<Student> algebra = new ArrayList<Student>();
		
		System.out.println("Number of students:");
		int students = input.nextInt();
				
		for (int i = 0; i < students; i++) {
			input.nextLine();

			System.out.println("Name:");
			String name = input.nextLine();
			System.out.println("Score:");
			int score = input.nextInt();
			algebra.add(new Student(name, score));
		}
		
		for (int i = 0; i < algebra.size(); i++) {
			System.out.println("Name: " + algebra.get(i).returnName());
			System.out.println("Score: " + algebra.get(i).returnScore());
		}
		
		input.close();
	}
}
