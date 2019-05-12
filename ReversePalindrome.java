package zadaci;

import java.util.Scanner;

public class ReversePalindrome {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Unesite cijeli broj: ");
		int number = input.nextInt();
		input.close();

		if (isPalindrome(number)) {
			System.out.println("Uneseni broj je palindrom.");
		} else {
			System.out.println("Uneseni broj nije palindrom.");
		}

	}

	public static int reverse(int number) {
		String backwards = "";
		String num = number + "";
		for (int i = num.length() - 1; i >= 0; i--) {
			backwards += num.charAt(i);
		}
		return Integer.parseInt(backwards);
	}

	public static boolean isPalindrome(int number) {
		return number == reverse(number);
	}
}
