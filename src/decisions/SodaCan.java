package decisions;

public class SodaCan {
	private double radius;		//inches
	private double height;		//inches
	private final double costOfAluminum = 2.60;		//$2.60 per square inch
	
	public SodaCan() {
		radius = 1.5;
		height = 3;
	}
	//radius - can't be less than 0 (no negative). Otherwise set to 1.5
	//height - can't be less than 0 (no negative). Otherwise set to 3
	public SodaCan(double newRadius, double newHeight) {
		if (newRadius > 0) {
			radius = newRadius;
		}
		else {
			radius = 1.5;
		}
		
		if (newHeight > 0) {
			height = newHeight;
		}
		else {
			height = 3;
		}
	}
	
	public double getRadius() {
		return radius;
	}
	public double getHeight() {
		return height;
	}
	public double getCost() {
		return costOfAluminum;
	}
	
	//radius - can't be less than 0 (no negative). Otherwise set to 1.5
	public void setRadius(double newRadius) {
		if (newRadius > 0) {
			radius = newRadius;
		}
		else {
			radius = 1.5;
		}
	}
	//height - can't be less than 0 (no negative). Otherwise set to 3
	public void setHeight(double newHeight) {
		if (newHeight > 0) {
			height = newHeight;
		}
		else {
			height = 3;
		}
	}
	
	public double surfaceArea() {
		double surfaceArea = (2 * 3.14 * radius * height) + (2 * 3.14 * radius * radius);
		return surfaceArea;
	}
	public double volume() {
		double volume = 3.14 * radius * radius * height;
		return volume;
	}
	public double cost() {
		double cost = this.surfaceArea() * 2.60;		//2.60/1 = cost/surfaceArea ----> cross multiply ----> 2.60*surfaceArea = cost
		return cost;
	}
}
