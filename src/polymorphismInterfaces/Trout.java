package polymorphismInterfaces;

public class Trout implements Fish {
	private double length;
	private int age;
	private double numScales;
	
	public Trout(double l, int a, double scales) {
		length = l;
		age = a;
		numScales = scales;
	}
	
	public int getAge() {
		return age;
	}
	public double getLength() {
		return length;
	}
	public double getNumScales() {
		return numScales;
	}
	
	public String toString() {
		return ("Trout: length - " + length + ", age - " + age + ", numScales - " + numScales);
	}
}
