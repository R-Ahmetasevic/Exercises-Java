package zadaci;

import java.util.Scanner;

public class CheckPalindrome {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		
		System.out.println("Unesite cijeli broj:");
		int unos = scn.nextInt();
		
		int reverse = 0;
		int cifra = 0;
		int temp = unos;
		
		while(unos > 0) {
			cifra = unos % 10;
			reverse = (reverse * 10) + cifra;
			unos /= 10;
		}
		
		if(temp == reverse) {
			System.out.println(temp + " je palindrom");
		}
		else {
			System.out.println(temp + " nije palindrom");
		}
		
		scn.close();
	}
}
