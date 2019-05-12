package zadaci;

import java.util.Scanner;

public class BrojPonavljanjaBroja {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Unesite niz od 10 brojeva: ");
		
		int[] array = new int[10];
		int[] counter = new int[100];

		for (int i = 0; i < array.length; i++) {
			int num = input.nextInt();
			array[i] = num;
			counter[num]++;
		}

		input.close();
		
		for (int i = 0; i < counter.length; i++) {
			if (counter[i] != 0) {
				System.out.println("Broj " + i + " se pojavljuje " + counter[i]
						+ (counter[i] == 1 ? " put." : " puta."));
			}
		}
	}
}
