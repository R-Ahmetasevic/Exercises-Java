package zadaci;

import java.util.Scanner;

public class NajmanjiElementPoNeparnojPoziciji {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		
		int[] niz = new int[10];

		System.out.println("Unesite 10 cijelih brojeva:");
		for(int i=0; i<niz.length; i++) {
			niz[i] = scn.nextInt();
		}
		System.out.println("Najmanji element na neparnoj poziciji je: " + min(niz));
		
		scn.close();
	}
	
	public static int min(int[] array) {
		int min = array[1];
		for (int i=0; i<array.length; i++) {
			if (i % 2 != 0 && min>array[i]) {
				min = array[i];
			}
		}
		return min;
	}
}

