package zadaci;

import java.util.Scanner;

public class SortiranjeKolonaMatrice {

	public static void main(String[] args) {

		double[][] niz = new double[3][3];
		
		System.out.println("Unesite brojeve u 3x3 matricu:");
		enterMatrix(niz);
		
		System.out.println("Originalni niz:");
		printArray(niz);
		
		double[][] sortirano = sortColumns(niz);
		System.out.println("Sortiran niz:");
		printArray(sortirano);
	
	}
	
	public static double[][] sortColumns(double[][] m){
		
		double[][] result = copy(m);
		
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[i].length; j++) {
				for (int k = 0; k < result[i].length; k++) {
					if (result[j][i] < result[k][i]) {
						double temp = result[j][i];
						result[j][i] = result[k][i];
						result[k][i] = temp;
					}
				}
			}
		}
		return result;	
	}
	
	public static void printArray(double[][] m) {
		for(int i=0; i<m.length; i++) {
			for(int j=0; j<m.length; j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void enterMatrix(double[][] m) {
		
		Scanner scn = new Scanner(System.in);
		
		for(int i=0; i<m.length; i++) {
			for(int j=0; j<m[0].length; j++) {
				m[i][j] = scn.nextDouble();
			}
		}		
		scn.close();
	}
	
	public static double[][] copy(double[][] m){
		double[][] copy = new double[m.length][m[0].length];
		
		for(int i=0; i<m.length; i++) {
			for(int j=0; j<m[0].length; j++) {
				copy[i][j] = m[i][j];
			}
		}
		return copy;
	}
	

}
