package zadaci;

import java.util.Scanner;

public class BacanjeNovcicaNPuta {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		
		System.out.println("Unesite broj bacanja novcica:");
		int unos = scn.nextInt();
		
		simulacija(unos);
		
		scn.close();
	}
	
	public static void simulacija(int brojBacanjaNovcica) {
		
		int brojGlava = 0;
		int brojPisama = 0;
		
		for(int i=0; i<brojBacanjaNovcica; i++) {
			int rand = (int)(0 + Math.random() * 2);
			
			if(rand == 0) {
				brojGlava++;
			}
			else {
				brojPisama++;
			}	
		}
		
		System.out.println("Novcic je pokazao glavu: " + brojGlava + " " + (brojGlava == 1 ? "put" : "puta"));
		System.out.println("Novcic je pokazao pismo: " + brojPisama + " " + (brojPisama == 1 ? "put" : "puta"));	
	}
}
