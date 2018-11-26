package strings;

import java.util.Scanner;

public class PrimitiveThenStringInput {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Age?");
		int age = input.nextInt();
		
		input.nextLine();		//clear buffer
		
		System.out.println("Name?");
		String name = input.nextLine();
		
		System.out.println(name + " is " + age + " years old.");
	}
}
