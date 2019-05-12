package zadaci;

public class PalindromicPrime {

	public static void main(String[] args) {

		int zbroj = 0;
		int i=0;
		
		while(zbroj < 100) {
			if(isPrime(i) && isPalindrome(i)) {
				System.out.print(i + " ");
				zbroj++;
				if(zbroj % 10 == 0) {
					System.out.println();
				}
			}
			i++;
		}
	}
	
	public static boolean isPrime(int n) {
		
		if((n == 0) || (n == 1)) {
			return false;
		}
		
		for(int i=2; i<=n/2; i++) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static int reverse(int n) {
		
		String backwards = "";
		String num = n + "";
		for (int i=num.length()-1; i>=0; i--) {
			backwards += num.charAt(i);
		}
		return Integer.parseInt(backwards);
	}
	
	public static boolean isPalindrome(int n) {
		return n == reverse(n);
	}
}
