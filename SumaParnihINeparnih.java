package zadaci;

import java.util.Scanner;

public class SumaParnihINeparnih {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		
		int[] niz = new int[10];
		
		System.out.println("Unesite 10 cijelih brojeva:");
		for(int i=0; i<niz.length; i++) {
			niz[i] = scn.nextInt();
		}
		
		System.out.println("Suma parnih brojeva: " + sumaParnih(niz));
		System.out.println("Suma neparnih brojeva: " + sumaNeparnih(niz));
		
		scn.close();
	}
	
	public static int sumaParnih(int[] array) {
		
		int sumaParnih = 0;
		
		for(int i=0; i<array.length; i++) {
			if(array[i] % 2 == 0) {
				sumaParnih += array[i];
			}
		}
		return sumaParnih;
	}
	
	public static int sumaNeparnih(int[] array) {
		
		int sumaNeparnih = 0;
		
		for(int i=0; i<array.length; i++) {
			if(array[i] % 2 != 0) {
				sumaNeparnih += array[i];
			}
		}
		return sumaNeparnih;
	}
}
