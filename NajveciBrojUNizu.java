package zadaci;

import java.util.Scanner;

public class NajveciBrojUNizu {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		
		System.out.println("Unesite duzinu niza:");
		int duzinaNiza = scn.nextInt();
		
		int[] niz = new int[duzinaNiza];
		
		System.out.println("Unesite " + duzinaNiza + " broja u niz:");
		for(int i=0; i<niz.length; i++) {
			niz[i] = scn.nextInt();
		}
		
		System.out.println("Najveci broj u nizu je: " + max(niz));
		
		scn.close();
	}
	
	public static int max (int[] array) {
		
		int max = Math.abs(array[0]);
		
		for (int i=0; i<array.length; i++) {
			if (Math.abs(array[i]) > max) {
				max = Math.abs(array[i]);
			}
		}
		return max;
	}
}
