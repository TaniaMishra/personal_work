package oop;

import java.util.Scanner;

public class TestCat {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Cat bob = new Cat();
		
		System.out.println("What is the cat's age?");
		bob.changeAge(input.nextInt());
		System.out.println("How many hours does the cat sleep?");
		bob.changeSleep(input.nextDouble());
		System.out.println("Cat's Age: " + bob.getAge());
		System.out.println("Hours of Sleep the Cat Gets: " + bob.getSleep());
		bob.sleepMore();
		System.out.println("The cat got another hour of sleep tonight! " + bob.getSleep() + " hours!");
		bob.birthday();
		System.out.println("The cat had a birthday! She's now " + bob.getAge() + " years old.");
		bob.sleepLess();
		bob.sleepLess();
		System.out.println("Today, the cat slept for two hours less than yesterday. :(");
		
		
		input.close();
	}
}
