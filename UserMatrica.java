package zadaci;

import java.util.Scanner;

public class UserMatrica {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		
		System.out.println("Unesite velicinu matrice:");
		int velicina = scn.nextInt();
		
		int[][] mat = new int[velicina][velicina];
		
		System.out.println("Unesite " + mat.length + " reda i " + mat[0].length +
				" kolone:");
		for(int red=0; red<mat.length; red++) {
			for(int kolona=0; kolona<mat[red].length; kolona++) {
				mat[red][kolona] = scn.nextInt();
			}
		}
		
		printArray(mat);
		redNajvecegZbira(mat);
		
		scn.close();
	}
	
	public static void printArray(int[][] array) {
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				System.out.print(array[i][j] +  " ");
			}
			System.out.println();
		}
	}
	
	public static void redNajvecegZbira(int[][] array) {
		
		int najveciRed = 0;
		int indeksNajvecegReda = 0;
		
		for(int kolona=0; kolona<array[0].length; kolona++) {
			najveciRed += array[0][kolona];
		}

		for(int red=1; red<array.length; red++) {
			int zbirOvogReda = 0;
			for(int kolona=0; kolona<array[red].length; kolona++) {
				zbirOvogReda += array[red][kolona];
			}
			
			if(zbirOvogReda > najveciRed) {
				najveciRed = zbirOvogReda;
				indeksNajvecegReda = red;
			}
		}
		
		System.out.println();
		System.out.println("Red " + indeksNajvecegReda + " ima najveci zbir:"+ 
		najveciRed);
	}
}
