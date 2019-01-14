package inheritance;

public class TestBalls {
	public static void main(String[] args) {
		Ball ball = new Basketball();
		
		ball.method1();
		ball.method2();
		
		Basketball bob = new Basketball();
		
		bob.method1();
		bob.method2();
		bob.method3();

	}
}
