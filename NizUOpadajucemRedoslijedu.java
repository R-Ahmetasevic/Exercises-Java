package zadaci;

import java.util.Scanner;

public class NizUOpadajucemRedoslijedu {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Unesite niz od 10 brojeva:");

		int[] array = new int[10];

		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextInt();
		}
		
		input.close();
		
		for(int i = 0; i<array.length; i++){
			for(int j = i; j<array.length; j++){
				if(array[i] < array[j]){
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
}
