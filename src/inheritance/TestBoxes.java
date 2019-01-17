package inheritance;

public class TestBoxes {
	public static void main(String[] args) {
		Storage bob = new Storage();
		
		bob.method1();
		bob.method2();
		bob.method3();
		bob.method4();
		bob.method5();
		
		Box box = new Box();

		box.method1();
		box.method2();
		box.method3();
		box.method5();
	}
}
