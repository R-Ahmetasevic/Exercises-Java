package zadaci;

import java.util.Scanner;

public class IdentticniNizovi {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		
		int[] array1 = new int[5];
		int[] array2 = new int[5];
		
		System.out.println("Unesite 5 brojeva u prvi niz:");
		for(int i=0; i<array1.length; i++) {
			int num = scn.nextInt();
			array1[i] = num;
		}
		
		System.out.println("Unesite 5 brojeva u drugi niz:");
		for(int i=0; i<array2.length; i++) {
			int num = scn.nextInt();
			array2[i] = num;
		}
		
		if(equals(array1, array2)) {
			System.out.println("Nizovi su identicni");
		}
		else {
			System.out.println("Nizovi nisu identicni");
		}
		
		scn.close();
	}
	
	public static boolean equals(int[] array1, int[] array2) {
		
		if (array1.length != array2.length) {
			return false;
		} 
		else {
			for (int i = 0; i<array1.length; i++) {
				if (array1[i] != array2[i]) {
					return false;
				}
			}
			return true;
		}	
	}
}
