package zadaci;

import java.util.Scanner;

public class CountLettersSpacesEtc {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		
		System.out.println("Unesite string:");
		String unos = scn.nextLine();
		
		int zbrojSlova = 0;
		int zbrojSpace = 0;
		int zbrojBrojeva = 0;
		int zbrojOstalo = 0;
		
		for(int i=0; i<unos.length(); i++) {
			
			if(Character.isLetter(unos.charAt(i))) {
				zbrojSlova++;
			}
			else if(Character.isDigit(unos.charAt(i))) {
				zbrojBrojeva++;
			}
			else if(Character.isWhitespace(unos.charAt(i))) {
				zbrojSpace++;
			}
			else {
				zbrojOstalo++;
			}
		}
		
		System.out.println("Slova: " + zbrojSlova);
		System.out.println("Space: " + zbrojSpace);
		System.out.println("Brojeva: " + zbrojBrojeva);
		System.out.println("Ostalo: " + zbrojOstalo);
		
		
		scn.close();
	}

}
