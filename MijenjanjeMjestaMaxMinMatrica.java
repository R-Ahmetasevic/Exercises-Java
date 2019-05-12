package zadaci;

import java.util.Scanner;

public class MijenjanjeMjestaMaxMinMatrica {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		System.out.println("Unesite broj redova i broj kolona: ");
		int rows = in.nextInt();
		int columns = in.nextInt();
		
		int[][] matrix = new int[rows][columns];
		
		System.out.println("Unesite elemente matrice: ");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = in.nextInt();
			}
		}
		in.close();

		int rowMin = 0;
		int colMin = 0;
		int min = matrix[rowMin][colMin];

		int rowMax = 0;
		int colMax = 0;
		int max = matrix[rowMax][colMax];

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] < min) {
					min = matrix[i][j];
					rowMin = i;
					colMin = j;
				}
				if (matrix[i][j] > max) {
					max = matrix[i][j];
					rowMax = i;
					colMax = j;
				}
			}
		}

		int temp = matrix[rowMax][colMax];
		matrix[rowMax][colMax] = matrix[rowMin][colMin];
		matrix[rowMin][colMin] = temp;

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
}
