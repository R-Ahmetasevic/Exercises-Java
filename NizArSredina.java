package zadaci;

import java.util.Scanner;

public class NizArSredina {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		
		double[] niz = new double[10];
		
		System.out.println("Unesite niz od 10 double brojeva:");
		for(int i=0; i<niz.length; i++) {
			niz[i] = scn.nextDouble();
		}
		
		double average = average(niz);
		System.out.println("Prosjek unesenih brojeva iznosi: " + average);
		
		scn.close();
	}
	
	public static int average(int[] array) {

		int suma = 0;
		
		for(int e : array) {
			suma += e;
		}
		
		return suma / array.length;
	}
	
	public static double average(double[] array) {
		
		double suma = 0;
		
		for(double e : array) {
			suma += e;
		}
		
		return suma / array.length;
	}
}
