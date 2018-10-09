package oop;

public class Employee {

	private double wage;
	private double experience;
	
	public Employee() {
		wage = 16.00;
		experience = 3.5;
	}
	
	public double getWage() {
		return wage;
	}
	public void setWage(double newWage) {
		wage = newWage;
	}
	
	public double getExperience() {
		return experience;
	}
	public void setExperience(double newExperience) {
		experience = newExperience;
	}
	
	public void raiseWage() {
		wage = wage * 1.1;
	}
}
