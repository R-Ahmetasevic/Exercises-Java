package zadaci;

import java.util.Scanner;

public class MatricaN {
	public static void main(String[] args) {
		Scanner unos=new Scanner(System.in);
		
		System.out.print("Unijeti n: ");
		int n=unos.nextInt();
		
		printMatrix(n);
		
		unos.close();
	}
	
	public static void printMatrix(int n){
		int[][] mat=new int[n][n];
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				mat[i][j]=(int)(Math.random()*10)%2;
				System.out.printf("%3d",mat[i][j]);
			}
			System.out.println();
		}
	}
}
