package oop;

public class Cat {
	private int age;
	private double sleep;
	
	public Cat() {
		age = 2;
		sleep = 12.5;
	}
	
	public int getAge() {
		return age;
	}
	public double getSleep() {
		return sleep;
	}
	public void changeAge(int newAge) {
		age = newAge;
	}
	public void changeSleep(double newSleep) {
		sleep = newSleep;
	}
	
	public void birthday() {
		age++;
	}
	public void sleepMore() {
		sleep++;
	}
	public void sleepLess() {
		sleep--;
	}
}
