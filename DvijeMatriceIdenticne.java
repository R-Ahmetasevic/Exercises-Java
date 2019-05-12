package zadaci;

import java.util.Scanner;

public class DvijeMatriceIdenticne {

	public static boolean equals(int[][] m1, int[][] m2) {
		for (int i = 0; i < m1.length; i++) {
			for (int j = 0; j < m1[i].length; j++) {
				if (m1[i][j] != m2[i][j]) {
					return false;
				}
			}
		}
		return true;
	}

	public static void enterMatrix(int[][] matrix) {
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = input.nextInt();
			}
		}
		input.close();
	}

	public static void main(String[] args) {
		int[][] matrix1 = new int[3][3];
		int[][] matrix2 = new int[3][3];
		System.out.println("Enter the first matrix: ");
		enterMatrix(matrix1);
		System.out.println("Enter the second matrix: ");
		enterMatrix(matrix2);
		if (equals(matrix1, matrix2)) {
			System.out.println("Two arrays are strictly identical.");
		} else {
			System.out.println("Two arrays aren't strictly identical.");
		}
	}

}
