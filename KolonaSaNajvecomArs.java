package zadaci;

import java.util.Scanner;

public class KolonaSaNajvecomArs {

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
		
		int indexOfColumn = 0;
		double minAverage = Integer.MAX_VALUE;
		
		for (int i = 0; i < matrix.length; i++) {
			double sumByColumn = 0;
			for (int j = 0; j < matrix[i].length; j++) {
				sumByColumn += matrix[j][i];
			}

			double average = sumByColumn / matrix[i].length;

			System.out.println(average);
			if (average < minAverage) {
				minAverage = average;
				indexOfColumn = i;
			}
		}

		System.out.println("Indeks kolone sa najmanjom aritmetickom sredinom: "
				+ indexOfColumn);
	}
}
