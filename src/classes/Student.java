package classes;

import java.util.ArrayList;

public class Student {
	private String name;
	private ArrayList<Integer> tests;
	private int howMany;
	
	public Student() {
		name = "Bob Smith";
	}
	
	public Student(String n, ArrayList<Integer> t, int num) {
		name = n;
		tests = t;
		howMany = num;
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
	
	public String toString() {
		return ("Student: name - " + name + ", tests - " + tests + ", howMany - " + howMany);
	}
	
	public Student clone() {
		return new Student(name, tests, howMany);
	}
	
	public boolean equals(Student user) {
		if (this.toString().equals(user.toString())) {
			return true;
		}
		else {
			return false;
		}
	}
}
