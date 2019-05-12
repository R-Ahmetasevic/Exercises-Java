package zadaci;

import java.util.Scanner;

public class StringMaxKarakter {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		
		System.out.println("Unesite string:");
		String unos = scn.nextLine();
		
		maxChar(unos);
		
		scn.close();
		
		
	}
	
	public static void maxChar(String str) {
		
		char[] count = new char[256];
		int[] countNum = new int[100];
		int zbroj = 0;
		
		for(int i=0; i<str.length(); i++) {
			count[str.charAt(i)]++;
			
		}
		
		int max = -1;
		char rez = ' ';
		String novi = "";
	
		
		
		for(int i=0; i<str.length(); i++) {
			if(max < count[str.charAt(i)]) {
				max = count[str.charAt(i)];
				rez = str.charAt(i);
				
			}
		}
		
	}
}
