package zadaci;

import java.util.Scanner;

public class PrviIZadnjiUNizu {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		int[] arr = new int[10];
		
		System.out.println("Unesite 10 cijelih brojeva: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = in.nextInt();
		}
			
		in.close();
		
		int countMin = 0;
		int countMax = 0;
		int min = arr[0];
		int max = arr[arr.length-1];
			
		for (int i : arr) {
			if(i < min){
				countMin++;
			}
			if(i > max){
				countMax++;
			}
		}
			
		System.out.println("Broj brojeva manjih od prvog elementa: " + countMin);
		System.out.println("Broj brojeva vecih od posljednjeg elementa: " + countMax);
	}
}
