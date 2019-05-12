package zadaci;

import java.util.Scanner;

public class SumaNegativnihElemenataMatrice {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		
		System.out.println("Unesite broj redova matrice:");
		int brojRedova = scn.nextInt();
		
		System.out.println("Unesite broj kolona matrice:");
		int brojKolona = scn.nextInt();
		
		int[][] mat = new int[brojRedova][brojKolona];
		
		System.out.println("Unesite " + mat.length + " reda i " + mat[0].length
				+ " kolone:");
		enterMatrix(mat);
		printArray(mat);
		System.out.println("Suma negativnih elemenata: " + sum(mat));
		
		scn.close();
	}
	
	public static void enterMatrix(int[][] m) {
		
		Scanner scn = new Scanner(System.in);
		
		for(int i=0; i<m.length; i++) {
			for(int j=0; j<m[0].length; j++) {
				m[i][j] = scn.nextInt();
			}
		}
		scn.close();
	}
	
	public static void printArray(int[][] m) {
		for(int i=0; i<m.length; i++) {
			for(int j=0; j<m[0].length; j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static int sum(int[][] m) {
		
		int zbroj = 0;
		
		for(int i=0; i<m.length; i++) {
			for(int j=0; j<m[0].length; j++) {
				if(m[i][j] < 0) {
					zbroj += m[i][j];
				}
			}
		}
		return zbroj;		
	}
	
	
	
	
	

}
