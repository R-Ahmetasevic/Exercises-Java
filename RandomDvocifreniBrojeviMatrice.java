package zadaci;

import java.util.Scanner;

public class RandomDvocifreniBrojeviMatrice {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		System.out.println("Unesite broj redova matrice:");
		int brojRedova = scn.nextInt();

		System.out.println("Unesite broj kolona matrice:");
		int brojKolona = scn.nextInt();

		int[][] mat = new int[brojRedova][brojKolona];

		System.out.println("Unesite " + mat.length + " reda i " + mat[0].length + " kolone:");
		fillMatrix(mat);
		printMatrix(mat);
		
		System.out.println("Suma neparnih elemenata matrice: " + sumaNeparnih(mat));
		
		scn.close();
	}

	public static void fillMatrix(int[][] mat) {
		
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat[0].length; j++) {
				mat[i][j] = (int) (10 + Math.random() * 90);
			}
		}
	}
	
	public static void printMatrix(int[][] m) {
		for(int i=0; i<m.length; i++) {
			for(int j=0; j<m[0].length; j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static int sumaNeparnih(int[][] m) {
		
		int zbroj = 0;
		
		for(int i=0; i<m.length; i++) {
			for(int j=0; j<m[0].length; j++) {
				if(m[i][j] % 2 != 0) {
					zbroj += m[i][j];
				}
			}
		}
		return zbroj;
	}
}
