package zadaci;

import java.util.Scanner;

public class ElementiVeciOdTriUMatrici {

	public static void main(String[] args) {

		int[][] mat = new int[3][3];
		
		System.out.println("Unesite brojeve u 3x3 matricu:");
		enterMatrix(mat);
		printArray(mat);
		System.out.println("Ukupno lemenata vecih od 3 je: " + countGreaterThan3(mat));
	}
	
	public static void printArray(int[][] mat) {
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat[0].length; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
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
	
	public static int countGreaterThan3(int[][] matrix) {
		
		int zbroj = 0;
		
		for(int i=0; i<matrix.length; i++) {
			for(int j=0; j<matrix[0].length; j++) {
				if(matrix[i][j] > 3) {
					zbroj++;
				}
			}
		}
		return zbroj;
	}
	

}
