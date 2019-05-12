package zadaci;

import java.util.Scanner;

public class BrisiCharIzStringa {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		
		System.out.println("Unesite string:");
		String unosStringa = scn.nextLine();
		
		System.out.println("Unesite karakter koji bi zeljeli izbrisati iz stringa:");
		char ch = scn.next().charAt(0);
		
		System.out.println("Rezultat: " + removeChar(unosStringa, ch));
		
		scn.close();
	}
	
	public static String removeChar(String str, char ch) {
		
		String result = "";
		for (int i = 0; i<str.length(); i++) {
			char a = str.charAt(i);
			if (a != ch) {
				result += a;
			}
		}
		return result;
	}
}
