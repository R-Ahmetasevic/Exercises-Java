package zadaci;

import java.util.Scanner;

public class ObrnutiNiz {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int[] niz = new int[10];

		System.out.print("Unesite niz od 10 brojeva: ");
		for (int i = 0; i < niz.length; i++) {
			niz[i] = input.nextInt();
		}

		input.close();
		
		int[] obrnutiNiz = reverse(niz);

		for (int broj : obrnutiNiz) {
			System.out.print(broj + " ");
		}
	}
	
	public static int[] reverse(int[] array) {
		
		int[] result = new int[array.length];
		
		for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
			result[j] = array[i];
		}
		return result;
	}
}
