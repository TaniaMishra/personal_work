package classes;

public class ThreeMethods {
	private double radius;
	
	public ThreeMethods() {
		radius = 5;
	}
	
	//radius can't be less than 0
	public ThreeMethods(double r) {
		if (r > 0) {
			radius = r;
		}
		else {
			radius = 5;
		}
	}
	
	public String toString() {
		return("ThreeMethods: radius - " + radius);
	}
	
	public ThreeMethods clone() {
		return new ThreeMethods(radius);
	}
	
	public boolean equals(ThreeMethods user) {
		return (this.toString().equals(user.toString()));
	}
}
