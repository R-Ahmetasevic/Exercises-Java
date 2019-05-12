package zadaci;

import java.util.Scanner;

public class RedKolonaSaNajvecimBrojem {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter number of rows and columns: ");
		int row = input.nextInt();
		int col = input.nextInt();
		
		double[][] matrix = new double[row][col];
		
		System.out.println("Enter the array:");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = input.nextDouble();
			}
		}
		
		input.close();
		printArray(matrix);
		int[] location = locateLargest(matrix);
		System.out.println("The location of the largest element is at ("
				+ location[0] + "," + location[1] + ")");

	}
	
	public static int[] locateLargest(double[][] a) {
		
		int row = 0;
		int column = 0;
		double max = a[0][0];
		for (int i=0; i<a.length; i++) {
			for (int j=0; j<a[i].length; j++) {
				if(a[i][j] > max) {
					max = a[i][j];
					row = i;
					column = j;
				}
			}
		}
		return new int[] { row, column };		
	}
	
	public static void printArray(double[][] array) {
		for(int red=0; red<array.length; red++) {
			for(int kolona=0; kolona<array[red].length; kolona++) {
				System.out.print(array[red][kolona] + " ");
			}
			System.out.println();
		}
	}
}
