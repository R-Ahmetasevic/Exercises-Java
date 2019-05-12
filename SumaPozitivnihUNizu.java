package zadaci;

import java.util.Scanner;

public class SumaPozitivnihUNizu {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		
		int[] niz = new int[10];
		
		System.out.println("Unesite 10 cijelih brojeva:");
		for(int i=0; i<niz.length; i++) {
			niz[i] = scn.nextInt();
		}
		
		System.out.println("Suma pozitivnih brojeva djeljivih sa 3: " + racun(niz));
		
		scn.close();
	}
	
	public static int racun(int[] array) {
		
		int zbroj = 0;
		
		for(int i=0; i<array.length; i++) {
			if(array[i] > 0) {
				if(array[i] % 3 == 0) {
					zbroj += array[i];
				}
			}
		}
		return zbroj;
	}
}
