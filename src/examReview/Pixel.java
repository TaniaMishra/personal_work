package examReview;

public class Pixel {
	private int red;
	private int green;
	private int blue;
	
	public Pixel(int r, int g, int b) {
		red = r;
		green = g;
		blue = b;
	}
	
	public String toString() {
		return "(" + red + ", " + green + ", " + blue + ")";
	}
}
