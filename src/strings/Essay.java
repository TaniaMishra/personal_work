package strings;

public class Essay {
	private String name;
	private String text;
	public Essay() {
		name = "Blah Blah";
		text = "Essay...";
	}
	public void setName(String newName) {
		name = newName;
	}
	public void setText(String newText) {
		text = newText;
	}
	public String getLast() {
		int space = name.indexOf(' ');
		String lastName = name.substring(space + 1, name.length());
		String capLastName = lastName.toUpperCase();
		return capLastName;
	}
	public int getFirstChars() {
		int space = name.indexOf(' ');
		String firstName = name.substring(0, space);
		int firstChars = firstName.length();
		return firstChars;
	}
	public boolean findX() {
		int xIndex = name.indexOf('X');
		boolean xInName;
		if (xIndex == -1) {
			xInName = false;
		}
		else {
			xInName = true;
		}
		return xInName;
	}
	public int words() {
		int spaceCounter = 0;
		int space = text.indexOf(' ');
		while (space != -1) {
			spaceCounter++;
			String restOfEssay = text.substring(space + 1, text.length());
			space = restOfEssay.indexOf(' ');
		}	
		int words = spaceCounter + 1;
		return words;
		//Use a for loop - test each index, if the character is a space, spaceCounter++, else, go back through and check the next character
	}
}
