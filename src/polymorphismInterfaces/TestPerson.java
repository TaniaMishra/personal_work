package polymorphismInterfaces;

import java.util.Scanner;
import java.util.ArrayList;

public class TestPerson {
	public static void main(String[] args) {
		//Activity 4 (Activity 1 of Homework)
		Scanner input = new Scanner(System.in);
		Person smith = new Teacher();
		System.out.println("Name: " + smith.getName());
		System.out.println("Age: " + smith.getAge());
		
		Person bob = new Student();
		System.out.println("Name: " + bob.getName());
		System.out.println("Age: " + bob.getAge());
		
		//Activity 4.5 (Activity 2 of Homework)
		Teacher lopez = new Teacher();
		Student john = new Student();
		
		lopez.setName("Jason Lopez");
		lopez.payMe();
		
		john.setName("John Joe");
		john.outSick();
		john.outSick();
		john.outSick();

		Person filterTeacher = lopez;
		Person filterStudent = john;
		
		System.out.println("Teacher Name: " + filterTeacher.getName());
		System.out.println("Teacher Age: " + filterTeacher.getAge());
		System.out.println("Student Name: " + filterStudent.getName());
		System.out.println("Student Age: " + filterStudent.getAge());
		
		//In Class Activities
		ArrayList<Person> people = new ArrayList<Person>();
		people.add(new Student());
		people.add(new Student());
		people.add(new Student());
		people.add(new Teacher());
		people.add(new Teacher());

		for (Person x : people) {
			String name = x.getName();
			int length = name.length();
			if (length > 10) {
				System.out.println(x.getAge());
			}
		}
		
		input.close();
	}
}
