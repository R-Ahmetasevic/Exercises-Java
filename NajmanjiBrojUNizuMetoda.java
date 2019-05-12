package zadaci;

import java.util.Scanner;

public class NajmanjiBrojUNizuMetoda {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		
		double[] niz = new double[10];
		
		System.out.println("Unesite niz od 10 double brojeva:");
		for(int i=0; i<niz.length; i++) {
			niz[i] = scn.nextDouble();
		}
		
		System.out.println("Najmanji element u nizu je: " + min(niz));
		
		scn.close();
	}
	
	public static double min(double[] array) {
		
		double min = array[0];
		
		for (double num : array) {
			if (num < min) {
				min = num;
			}
		}
		return min;
	}
}
