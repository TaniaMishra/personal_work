package decisions;

public class Triangle {
	private double base;
	private double height;
	private double hypo;
	
	public Triangle() {
		base = 2.0;
		height = 4.0;
		hypo = Math.sqrt(20.0);
	}
	public Triangle(double newBase, double newHeight, double newHypo) {
		if (newBase < 0 || newHeight < 0 || newBase + newHeight <= newHypo) {
			base = 2.0;
			height = 4.0;
			hypo = Math.sqrt(20.0);
		}
		else {
			base = newBase;
			height = newHeight;
			hypo = newHypo;
		}
		
	}
	
	public double getBase() {
		return base;
	}
	public double getHeight() {
		return base;
	}
	public void changeBase(double newBase) {
		base = newBase;
	}
	public void changeHeight(double newHeight) {
		height = newHeight;
	}
	
	public double hypot() {
		double hypot = (base * base) + (height * height);
		hypot = Math.sqrt(hypot);
		return hypot;
	}
	public double perimeter(double hypot) {
		double perimeter = base + height + hypot;
		return perimeter;
	}
	public double area() {
		double area = base * height;
		area = area/2;
		return area;
	}
}
