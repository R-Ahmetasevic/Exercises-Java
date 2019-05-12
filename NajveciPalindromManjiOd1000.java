package zadaci;

public class NajveciPalindromManjiOd1000 {

	public static void main(String[] args) {

		for (int i=1000; i>0; i--) {
			boolean isPrime = true;
			for (int j=2; j<i; j++) {
				if(i % j == 0){
					isPrime = false;
					break;
				}
			}
			int number = i;
			if(isPrime){
				int reverse = 0;
				while(number != 0){
					reverse += (number % 10);
					reverse *= 10;
					number /= 10;
				}
				reverse /= 10;
				
				if(reverse == i){
					System.out.println(i);
					break;
				}
			}
		}
	}
}
