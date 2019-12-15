import java.util.Scanner;

public class TextSearchDemo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// Phrase alınacak kullanıcıdan
		System.out.println("Please enter a phrase: ");
		String phrase = scanner.nextLine();

		System.out.println("My phrase: " + phrase);
		System.out.println("Number of chars in pharese: " + phrase.length());

		// Search Text alınacak kullanıcıdan
		System.out.println("Please enter a search text: ");
		String searchText = scanner.nextLine();

		System.out.println("My search text: " + searchText);
		System.out.println("Number of chars in search text: " + searchText.length());

		if (searchText.length() > phrase.length()) {
			System.out.println("Please enter a valid search text");
		} else {
			int i = 0;
			int count = 0;
			while (i <= phrase.length() - searchText.length()) {
				if (phrase.substring(i, i + searchText.length()).equals(searchText)) {
					count++;
				}
				i++;
			}
			System.out.println("Number of " + searchText + "'s in my phrase :" + count);

		}
		scanner.close(); 
	}
}

