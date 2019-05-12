package zadaci;

public class MethodIsPalindrome {

	public static void main(String[] args) {

		reverse(123456);
		isPalindrome(121);
	}
	
	public static int reverse(int number) {
		int cifra = 0;
		
		while(number > 0) {
			cifra = number % 10;
			number /= 10;
			System.out.print(cifra);
		}
		return cifra;
	}
	
	public static boolean isPalindrome(int number) {
		
		int reverse = 0;
		int cifra = 0;
		int temp = number;
		
		while(number > 0) {
			cifra = number % 10;
			reverse = reverse * 10 + cifra;
			number /= 10;
		}
		
		if(temp == reverse) {
			System.out.println("\n" + temp + " je palindrom");
			return true;
		}
		else {
			System.out.println("\n" + temp + " nije palindrom");
			return false;
		}
	}
}
