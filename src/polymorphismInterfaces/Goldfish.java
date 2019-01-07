package polymorphismInterfaces;

public class Goldfish implements Fish {
	private double length;
	private int age;
	private String color;
	
	public Goldfish(double l, int a, String c) {
		length = l;
		age = a;
		color = c;
	}
	
	public int getAge() {
		return age;
	}
	public double getLength() {
		return length;
	}
	public String getColor() {
		return color;
	}
	
	public String toString() {
		return ("Trout: length - " + length + ", age - " + age + ", color - " + color);
	}
}
