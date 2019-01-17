package inheritance;

public class TestTrapezoid {
	public static void main(String[] args) {
		Trapezoid trap = new Trapezoid();
		
		System.out.println("Perimeter: " + trap.perimeter());
		System.out.println("Area: " + trap.area());
		System.out.println(trap.toString());
		
		Trapezoid cloned = trap.clone();
		System.out.println("Cloned == Original? " + trap.equals(cloned));

	}
}
