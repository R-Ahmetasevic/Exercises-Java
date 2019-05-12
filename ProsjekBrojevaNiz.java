package zadaci;

import java.util.Scanner;

public class ProsjekBrojevaNiz {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Unesite niz brojeva (0 prekida unos): ");
		int[] array = new int[100];
		
		for(int i = 0; i < array.length; i++){
			int num = input.nextInt(); 
			array[i] = num; 
			if(num == 0){ 
				break;
			}
		}
		
		input.close();
		
		int average = average(array);

		int aboveOrEqual = 0;
		int below = 0;
		
		for(int num : array){
			if(num == 0){
				break;
			} 
			else { 
				if(num >= average){
					aboveOrEqual++;
				} 
				else {
					below++; 
				}
			}
		}
		System.out.println("Prosjek: " + average);
		System.out.println("Brojeva iznad ili jednako prosjeku: " + aboveOrEqual);
		System.out.println("Brojeva ispod prosjeka: " + below);
	}
	
	public static int average(int[] array) {
		int sum = 0;
		int count = 0; 
		
		for (int e : array) {
			sum += e;
			if(e == 0){
				break;
			}
			count++;
		}
		return sum / count;
	}
}
