package zadaci;

import java.util.Scanner;

public class RemoveChar {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Unesite string: ");
		String s = input.nextLine();
		System.out.println("Unesite karakter: ");
		char ch = input.next().charAt(0);
		input.close();

		System.out.println("Rezultat: " + removeChar(s, ch));
	}

	public static String removeChar(String str, char ch) {
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			char a = str.charAt(i);
			if (a != ch) {
				result += a;
			}
		}
		return result;
	}
}
