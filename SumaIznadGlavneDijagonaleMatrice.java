package zadaci;

import java.util.Scanner;

public class SumaIznadGlavneDijagonaleMatrice {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int[][] matrix = new int[4][4];
		
		System.out.println("Unesite elemente 4x4 matrice: ");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = in.nextInt();
			}
		}
		
		in.close();
		printArray(matrix);

		System.out.println("Suma elemenata iznad glavne dijagonale: "
			+ sumAboveMainDiagonal(matrix));
	}

	public static int sumAboveMainDiagonal(int[][] m) {
		int sum = 0;
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				if (j > i) {
					sum += m[i][j];
				}
			}
		}
		return sum;
	}
	
	public static void printArray(int[][] mat) {
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat[0].length; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
	}
}
