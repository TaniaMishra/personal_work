package oop;

public class TestRoom {

	public static void main(String[] args) {
		Room closet = new Room();
		Room kitchen = new Room();
		
		kitchen = closet;
		
		Room basement = new Room();
		
		closet = basement;
		
		closet.area();
		
	}

}
