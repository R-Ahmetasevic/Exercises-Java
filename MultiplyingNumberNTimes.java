package zadaci;

import java.util.Scanner;

public class MultiplyingNumberNTimes {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		
		System.out.println("Unesite cijeli broj:");
		int unos = scn.nextInt();
		
		for(int i=1; i<=10; i++) {
			System.out.println(unos + " x " + i + " = " + unos * i + " ");
		}
		
		scn.close();
	}
}
