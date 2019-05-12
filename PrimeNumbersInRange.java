package zadaci;

import java.util.Scanner;

public class PrimeNumbersInRange {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		
		System.out.println("Unesite pocetni broj:");
		int pocetni = scn.nextInt();
		
		System.out.println("Unesite krajnji broj:");
		int krajnji = scn.nextInt();
		
		System.out.println("Unesite koliko brojeva zelite po liniji:");
		int n = scn.nextInt();
		
		printPrimes(pocetni, krajnji, n);
			
		scn.close();
	}
	
	public static void printPrimes(int pocetniBroj, int krajnjiBroj, int n) {
		
		int zbroj = 0;
		
		for(int i=pocetniBroj; i<=krajnjiBroj; i++) {
			boolean isTrue = true;
			for(int j=2; j<i; j++) {
				if(i % j == 0) {
					isTrue = false;
					break;
				}
			}
			if(isTrue) {
				System.out.printf("%3d", i);
				zbroj++;
			}
			if(zbroj == n){
				System.out.println();
				zbroj = 0;
			}
		}
	}
}
