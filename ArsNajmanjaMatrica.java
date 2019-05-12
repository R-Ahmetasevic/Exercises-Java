package zadaci;

import java.util.Scanner;

public class ArsNajmanjaMatrica {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		
		System.out.println("Unesite broj redova matrice:");
		int brojRedova = scn.nextInt();
		
		System.out.println("Unesite broj kolona matrice:");
		int brojKolona = scn.nextInt();
		
		double[][] mat = new double[brojRedova][brojKolona];
		
		System.out.println("Unesite " + mat.length + " reda i " + mat[0].length +
				" kolone:");
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat[0].length; j++) {
				mat[i][j] = scn.nextDouble();
			}
		}
		
		printMatrix(mat);
		NajmanjaArs(mat);
				
		scn.close();
	}

	public static void printMatrix(double[][] mat) {
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat[0].length; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}		
	}
	
	public static void NajmanjaArs(double[][] niz) {
		
		int index = 0;		
		int zbroj = niz.length;
		
		double[] broj = new double[niz.length];
			
		for(int i=0; i<niz.length; i++) {
			int zbirOvogReda = 0;
			for(int j=0; j<niz[0].length; j++) {
				zbirOvogReda += niz[i][j];
			}
			broj[i] = zbirOvogReda;
		}
		
		double min = broj[0];
		
		for(int i=0; i<niz.length; i++) {
			for(int j=0; j<niz[0].length; j++) {
				if(broj[i] < min) {
					min = broj[i];
					index = i;
				}
			}
		}
		
		System.out.println("U redu " + index + " je najmanja ARS koja iznosi: " + 
		(min / zbroj));
	}
}
