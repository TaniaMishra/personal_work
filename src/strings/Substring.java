package strings;

public class Substring {

	public static void main(String[] args) {
		String text = "My name is Buzz Lightyear!";
		
		for (int i = 0; i < text.length(); i++) {
			System.out.println(text.substring(0, i));
		}
	}

}
