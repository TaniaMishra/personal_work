package inheritance;

public class Square extends Rectangle {
	public Square() {
		super(10, 10);
	}
	public Square(double side) {
		super(side, side);
	}
	
	public String toString() {
		return ("Square: " + super.toString());
	}
	public boolean equals(Object user) {
		return (this.toString().equals(user.toString()));
	}
	public Square clone() {
		return (new Square(super.getSide1()));
	}
}
