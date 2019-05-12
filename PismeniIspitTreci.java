package zadaci;

import java.util.Scanner;

public class PismeniIspitTreci {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		
		System.out.println("Unesite duzinu niza:");
		int duzinaNiza = scn.nextInt();
		scn.nextLine();
		
		String[] nizRijeci = new String[duzinaNiza];
		int[] nizBrojeva = new int[duzinaNiza];
		int[] brojSlova = new int[100];
		
		System.out.println("Unesite " + duzinaNiza + " stringa:");
		for(int i=0; i<nizRijeci.length; i++) {
			nizRijeci[i] = scn.nextLine();
		}
		
		System.out.println("Random brojevi:");
		for (int i=0; i<nizBrojeva.length; i++) {
			int element = (int) (1 + Math.random() * 10);
			for (int j=0; j<nizBrojeva.length; j++) {
				if (element == nizBrojeva[j]) {
					j = -1;
					element = (int) (1 + Math.random() * 10);
				}
			}
			nizBrojeva[i] = element;
			System.out.print(nizBrojeva[i] + " ");
		}
		
		for (int i=0; i<nizRijeci.length; i++) {
		    char[] svakoSlovoUNizu = nizRijeci[i].toCharArray();
		    for (int j=0; j<svakoSlovoUNizu.length; j++) {
		    	if (Character.isLetter(svakoSlovoUNizu[j])) {
		    		brojSlova[i]++;
		    	}
		    }     
		}
		
		System.out.println();
		System.out.println("Broj slova svake rijeci:");
		for(int i=0; i<brojSlova.length; i++) {
			if(brojSlova[i] != 0) {
				System.out.print(brojSlova[i] + " ");
			}
		}
		
		System.out.println();
		System.out.println("Rijeci cija se duzina podudara sa random brojevima:");
		for(int i=0; i<brojSlova.length; i++) {
			for(int j=0; j<nizBrojeva.length; j++) {
				if(brojSlova[i] == nizBrojeva[j]) {
					System.out.println(nizRijeci[i] + "-" + brojSlova[i]);
				}
			}
		}
		scn.close();
	}
}
