package inheritance;

public class TestParallelogram {
	public static void main(String[] args) {
		Parallelogram parallel = new Parallelogram();
		
		System.out.println("Perimeter: " + parallel.perimeter());
		System.out.println("Area: " + parallel.area());
		System.out.println(parallel.toString());
		
		Parallelogram cloned = parallel.clone();
		System.out.println("Cloned == Original? " + parallel.equals(cloned));
	}
}
