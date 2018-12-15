package classes;

import java.util.ArrayList;

public class Student {
	private String name;
	private ArrayList<Integer> tests;
	private int howMany;
	
	public Student() {
		name = "Bob Smith";
	}
	
	public void addScore(String score) {
		int intScore = Integer.parseInt(score);
		tests.add(intScore);
	}
	
	public double averageScores() {
		double average = 0;
		for (int i = 0; i < tests.size(); i++) {
			average += tests.get(i);
		}
		average = average/tests.size();
		return average;
	}
	
	public int lowestScore() {
		int lowest = 10000000;
		for (int i = 0; i < tests.size(); i++) {
			if (tests.get(i) < lowest) {
				lowest = tests.get(i);
			}
		}
		return lowest;
	}
	
	public String studentToString() {
		Student student = new Student();
		return student.toString();
	}
	
	public Student cloneStudent() {
		Student student = new Student();
		return student;
	}
	
	public boolean equalsTo(Student user) {
		Student student = new Student();
		if (student.equals(user)) {
			return true;
		}
		else {
			return false;
		}
	}
}
