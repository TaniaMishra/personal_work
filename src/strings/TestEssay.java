package strings;


public class TestEssay {
	public static void main(String[] args) {
		Essay book = new Essay();
		book.setName("Tania Mishra");
		book.setText("Hello! This is a wonderful essay about wonderful things!");
		System.out.println("Author's last name: " + book.getLast());
		System.out.println("There are " + book.getFirstChars() + " characters in the authors first name.");
		System.out.println("Does the authors name contain an 'X'? " + book.findX());
		System.out.println("There are " + book.words() + " words in the essay.");
	}
}
