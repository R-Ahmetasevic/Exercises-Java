package zadaci;

import java.util.Scanner;

public class PhoneKeypads {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		
		System.out.println("Unesite string:");
		String unos = scn.nextLine();
		unos = unos.replaceAll("\\s", "");
		
		String konvertovano = "";
		String dio = "";
		String rezultat = "";
		
		for(int i=0; i<unos.length(); i++) {
			char ch = unos.charAt(i);
			if(Character.isLetter(ch)) {
				konvertovano += getNumber(ch);
				dio += ch;
				rezultat = unos.replaceAll(dio, konvertovano);
			}	
		}
		System.out.print(rezultat);
		
		scn.close();
	}
	
	public static int getNumber(char uppercaseLetter) {
		
		int number = 0;
		
		if(Character.isUpperCase(uppercaseLetter)) {
			for(char i='A'; i<='Z'; i++) {
				if(uppercaseLetter == i) {
					switch(uppercaseLetter) {
						case 'A': case 'B': case 'C':
							number = 2;
							break;
						case 'D': case 'E': case 'F':
							number =  3;
							break;
						case 'G': case 'H': case 'I':
							number = 4;
							break;
						case 'J': case 'K': case 'L':
							number = 5;
							break;
						case 'M': case 'N': case 'O':
							number =  6;
							break;
						case 'P': case 'Q': case 'R': case 'S':
							number =  7;
							break;
						case 'T': case 'U': case 'V':
							number = 8;
							break;
						case 'W': case 'X': case 'Y':case 'Z':
							number = 9;
							break;
					}
				}
			}
		}
		else if(Character.isLowerCase(uppercaseLetter)) {
			for(char i='a'; i<='z'; i++) {
				if(uppercaseLetter == i) {
					switch(uppercaseLetter) {
						case 'a': case 'b': case 'c':
							number = 2;
							break;
						case 'd': case 'e': case 'f':
							number = 3;
							break;
						case 'g': case 'h': case 'i':
							number = 4;
							break;
						case 'j': case 'k': case 'l':
							number = 5;
							break;
						case 'm': case 'n': case 'o':
							number = 6;
							break;
						case 'p': case 'q': case 'r': case 's':
							number = 7;
							break;
						case 't': case 'u': case 'v':
							number = 8;
							break;
						case 'w': case 'x': case 'y':case 'z':
							number = 9;
							break;
					}
				}
			}
		}
		return number;
	}
}
