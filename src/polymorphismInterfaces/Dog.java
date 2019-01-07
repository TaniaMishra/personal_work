package polymorphismInterfaces;

import java.util.Random;

public class Dog implements Animal{
	private String name;
	private int age;
	private boolean injured;
	Random rand = new Random();
	
	public Dog(String n, int a, boolean i) {
		name = n;
		age = a;
		injured = i;
	}
	
	public void act() {
		injured = false;
		age += 7;
		int chance = 1 + rand.nextInt(50);
		if (chance == 1) {
			injured = true;
		}
	}
	
	public String toString() {
		return ("Dog: name - " + name + ", age - " + age + ", injured - " + injured);
	}
	
	public void vet() {
		injured = false;
	}
}
