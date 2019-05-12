package zadaci;

public class Emirps {

	public static void main(String[] args) {
		int i = 0;
		int count = 0;
		while(count < 100){
			if (isPrime(i) && isPrime(reverse(i)) && !isPalindrome(i)) {
				System.out.print(i + " ");
				count++;
				if(count % 10 == 0){
					System.out.println();
				}
			}
			i++;
		}
	}

	public static boolean isPrime(int number) {
		if (number == 0 || number == 1) {
			return false;
		}
		for (int i=2; i<=Math.sqrt(number); i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
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
