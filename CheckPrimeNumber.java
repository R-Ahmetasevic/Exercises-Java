package zadaci;

import java.util.Scanner;

public class CheckPrimeNumber {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		
		System.out.println("Unesite cijeli broj:");
		int unos = scn.nextInt();
		
		boolean flag = true;
		
		for(int i=2; i<=unos/2; i++) {
			
			int temp = unos % i;
			
			if(temp == 0) {
				flag = false;
				break;
			}
		}
		
		if(flag) {
			System.out.println(unos + " je prosti broj");
		}
		else {
			System.out.println(unos + " nije prosti broj");
		}
			
		scn.close();
	}
}
