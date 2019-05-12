package zadaci;

import java.util.Scanner;

public class IndeksNajmanjegElementa {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		
		int[] array = new int[10];
		
		System.out.println("Unesite 10 cijelih brojeva:");
		for(int i=0; i<array.length; i++) {
			int num = scn.nextInt();
			array[i] = num;
		}
		
		System.out.println("Najmanji broj u nizu je: " + indexOfSmallestElement(array));
		
		scn.close();
	}
	
	public static int indexOfSmallestElement(int[] array) {
		
		int min = array[0];
		
		for(int i : array) {
			if(i < min) {
				min = i;
			}
		}
		return min;
	}
}
