package zadaci;

import java.util.Scanner;

public class Ars {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		System.out.println("Unesite duzinu niza: ");
		int n = in.nextInt();
			
		int[] arr = new int[n];
		
		System.out.println("Unesite " + n + " cijelih brojeva: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = in.nextInt();
		}

		in.close();
		
		double average = average(arr);
		System.out.println("Aritmeticka sredina svih elemenata: " + average);
		
		int count = 0;
		for (int i : arr) {
			if (i < average) {
				count++;
			}
		}

		int[] result = new int[count];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < average) {
				result[result.length - count] = arr[i];
				count--;
			}
		}

		System.out.println("Aritmeticka sredina elemenata manjih od "
				+ "aritmeticke sredine svih elemenata iznosi: "
						+ average(result));
	}

	public static double average(int[] arr) {
		double sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum / arr.length;
	}
}
