package zadaci;

import java.util.Scanner;

public class BrojPonavljanjaKarakteraUStringu {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		
		System.out.println("Unesite string:");
		String unosStringa = scn.nextLine();
		
		System.out.println("Unesite karakter:");
		char ch = scn.next().charAt(0);
		
		count(unosStringa, ch);
		
		scn.close();
	}
	
	public static int count(String str, char a) {
		
		int zbroj = 0;
		
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			
			if(a == ch) {
				zbroj++;
			}
		}
		
		System.out.println("Broj ponavljanja karaktera " + a + ": " + zbroj + " " + (zbroj == 1 ? "put" : "puta"));
		
		return zbroj;
	}
}
