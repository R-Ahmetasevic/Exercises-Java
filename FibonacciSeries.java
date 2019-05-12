package zadaci;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		
		System.out.println("Unesite cijeli broj:");
		int unos = scn.nextInt();
		
		int x1=0, x2=1, next;
		
		System.out.println("Prvih " + unos + " fibonacijevih brojeva:");
		
		for(int i=0; i<=unos; i++) {
			
			if(i <= 1) {
				next = i;
			}
			else {
				next = x1 + x2;
				x1 = x2;
				x2 = next;
			}
			System.out.print(next + " ");
		}
		
		scn.close();
	}
}
