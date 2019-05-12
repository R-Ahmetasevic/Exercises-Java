package zadaci;

import java.util.Scanner;

public class ReversingAString {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		
		System.out.println("Unesite string:");
		String unos = scn.nextLine();
		
		String reverse = "";
		
		for(int i=unos.length()-1; i>=0; i--) {
			reverse += unos.charAt(i);
		}
		
		System.out.println(reverse);
		
		scn.close();
	}

}
